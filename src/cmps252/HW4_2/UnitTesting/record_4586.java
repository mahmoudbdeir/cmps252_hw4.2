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

@Tag("22")
class Record_4586 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4586: FirstName is Ira")
	void FirstNameOfRecord4586() {
		assertEquals("Ira", customers.get(4585).getFirstName());
	}

	@Test
	@DisplayName("Record 4586: LastName is Gerton")
	void LastNameOfRecord4586() {
		assertEquals("Gerton", customers.get(4585).getLastName());
	}

	@Test
	@DisplayName("Record 4586: Company is Cmnwlth Nurse Svc & Home Care")
	void CompanyOfRecord4586() {
		assertEquals("Cmnwlth Nurse Svc & Home Care", customers.get(4585).getCompany());
	}

	@Test
	@DisplayName("Record 4586: Address is Evergreen Avenue Rt 295 &")
	void AddressOfRecord4586() {
		assertEquals("Evergreen Avenue Rt 295 &", customers.get(4585).getAddress());
	}

	@Test
	@DisplayName("Record 4586: City is Thorofare")
	void CityOfRecord4586() {
		assertEquals("Thorofare", customers.get(4585).getCity());
	}

	@Test
	@DisplayName("Record 4586: County is Gloucester")
	void CountyOfRecord4586() {
		assertEquals("Gloucester", customers.get(4585).getCounty());
	}

	@Test
	@DisplayName("Record 4586: State is NJ")
	void StateOfRecord4586() {
		assertEquals("NJ", customers.get(4585).getState());
	}

	@Test
	@DisplayName("Record 4586: ZIP is 8086")
	void ZIPOfRecord4586() {
		assertEquals("8086", customers.get(4585).getZIP());
	}

	@Test
	@DisplayName("Record 4586: Phone is 856-845-9565")
	void PhoneOfRecord4586() {
		assertEquals("856-845-9565", customers.get(4585).getPhone());
	}

	@Test
	@DisplayName("Record 4586: Fax is 856-845-6179")
	void FaxOfRecord4586() {
		assertEquals("856-845-6179", customers.get(4585).getFax());
	}

	@Test
	@DisplayName("Record 4586: Email is ira@gerton.com")
	void EmailOfRecord4586() {
		assertEquals("ira@gerton.com", customers.get(4585).getEmail());
	}

	@Test
	@DisplayName("Record 4586: Web is http://www.iragerton.com")
	void WebOfRecord4586() {
		assertEquals("http://www.iragerton.com", customers.get(4585).getWeb());
	}
}
