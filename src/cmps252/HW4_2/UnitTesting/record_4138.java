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

@Tag("43")
class Record_4138 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4138: FirstName is Katie")
	void FirstNameOfRecord4138() {
		assertEquals("Katie", customers.get(4137).getFirstName());
	}

	@Test
	@DisplayName("Record 4138: LastName is Zeolla")
	void LastNameOfRecord4138() {
		assertEquals("Zeolla", customers.get(4137).getLastName());
	}

	@Test
	@DisplayName("Record 4138: Company is Boundary Whol Fnc & Railing")
	void CompanyOfRecord4138() {
		assertEquals("Boundary Whol Fnc & Railing", customers.get(4137).getCompany());
	}

	@Test
	@DisplayName("Record 4138: Address is 5002 23rd St")
	void AddressOfRecord4138() {
		assertEquals("5002 23rd St", customers.get(4137).getAddress());
	}

	@Test
	@DisplayName("Record 4138: City is Long Island City")
	void CityOfRecord4138() {
		assertEquals("Long Island City", customers.get(4137).getCity());
	}

	@Test
	@DisplayName("Record 4138: County is Queens")
	void CountyOfRecord4138() {
		assertEquals("Queens", customers.get(4137).getCounty());
	}

	@Test
	@DisplayName("Record 4138: State is NY")
	void StateOfRecord4138() {
		assertEquals("NY", customers.get(4137).getState());
	}

	@Test
	@DisplayName("Record 4138: ZIP is 11101")
	void ZIPOfRecord4138() {
		assertEquals("11101", customers.get(4137).getZIP());
	}

	@Test
	@DisplayName("Record 4138: Phone is 718-937-9712")
	void PhoneOfRecord4138() {
		assertEquals("718-937-9712", customers.get(4137).getPhone());
	}

	@Test
	@DisplayName("Record 4138: Fax is 718-937-8948")
	void FaxOfRecord4138() {
		assertEquals("718-937-8948", customers.get(4137).getFax());
	}

	@Test
	@DisplayName("Record 4138: Email is katie@zeolla.com")
	void EmailOfRecord4138() {
		assertEquals("katie@zeolla.com", customers.get(4137).getEmail());
	}

	@Test
	@DisplayName("Record 4138: Web is http://www.katiezeolla.com")
	void WebOfRecord4138() {
		assertEquals("http://www.katiezeolla.com", customers.get(4137).getWeb());
	}
}
