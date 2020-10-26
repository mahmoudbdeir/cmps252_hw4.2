package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("33")
class Record_4193 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4193: FirstName is Ashley")
	void FirstNameOfRecord4193() {
		assertEquals("Ashley", customers.get(4192).getFirstName());
	}

	@Test
	@DisplayName("Record 4193: LastName is Schiffmann")
	void LastNameOfRecord4193() {
		assertEquals("Schiffmann", customers.get(4192).getLastName());
	}

	@Test
	@DisplayName("Record 4193: Company is Birmingham Festival Of Arts")
	void CompanyOfRecord4193() {
		assertEquals("Birmingham Festival Of Arts", customers.get(4192).getCompany());
	}

	@Test
	@DisplayName("Record 4193: Address is 1502 Magnavox Way  #-140")
	void AddressOfRecord4193() {
		assertEquals("1502 Magnavox Way  #-140", customers.get(4192).getAddress());
	}

	@Test
	@DisplayName("Record 4193: City is Fort Wayne")
	void CityOfRecord4193() {
		assertEquals("Fort Wayne", customers.get(4192).getCity());
	}

	@Test
	@DisplayName("Record 4193: County is Allen")
	void CountyOfRecord4193() {
		assertEquals("Allen", customers.get(4192).getCounty());
	}

	@Test
	@DisplayName("Record 4193: State is IN")
	void StateOfRecord4193() {
		assertEquals("IN", customers.get(4192).getState());
	}

	@Test
	@DisplayName("Record 4193: ZIP is 46804")
	void ZIPOfRecord4193() {
		assertEquals("46804", customers.get(4192).getZIP());
	}

	@Test
	@DisplayName("Record 4193: Phone is 260-432-7825")
	void PhoneOfRecord4193() {
		assertEquals("260-432-7825", customers.get(4192).getPhone());
	}

	@Test
	@DisplayName("Record 4193: Fax is 260-432-6662")
	void FaxOfRecord4193() {
		assertEquals("260-432-6662", customers.get(4192).getFax());
	}

	@Test
	@DisplayName("Record 4193: Email is ashley@schiffmann.com")
	void EmailOfRecord4193() {
		assertEquals("ashley@schiffmann.com", customers.get(4192).getEmail());
	}

	@Test
	@DisplayName("Record 4193: Web is http://www.ashleyschiffmann.com")
	void WebOfRecord4193() {
		assertEquals("http://www.ashleyschiffmann.com", customers.get(4192).getWeb());
	}
}
