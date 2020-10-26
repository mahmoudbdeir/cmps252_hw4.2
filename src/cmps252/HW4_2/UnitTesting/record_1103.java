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

@Tag("25")
class Record_1103 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1103: FirstName is Jacklyn")
	void FirstNameOfRecord1103() {
		assertEquals("Jacklyn", customers.get(1102).getFirstName());
	}

	@Test
	@DisplayName("Record 1103: LastName is Negrete")
	void LastNameOfRecord1103() {
		assertEquals("Negrete", customers.get(1102).getLastName());
	}

	@Test
	@DisplayName("Record 1103: Company is Gillard, Joel W Esq")
	void CompanyOfRecord1103() {
		assertEquals("Gillard, Joel W Esq", customers.get(1102).getCompany());
	}

	@Test
	@DisplayName("Record 1103: Address is 601 Wolf St")
	void AddressOfRecord1103() {
		assertEquals("601 Wolf St", customers.get(1102).getAddress());
	}

	@Test
	@DisplayName("Record 1103: City is Syracuse")
	void CityOfRecord1103() {
		assertEquals("Syracuse", customers.get(1102).getCity());
	}

	@Test
	@DisplayName("Record 1103: County is Onondaga")
	void CountyOfRecord1103() {
		assertEquals("Onondaga", customers.get(1102).getCounty());
	}

	@Test
	@DisplayName("Record 1103: State is NY")
	void StateOfRecord1103() {
		assertEquals("NY", customers.get(1102).getState());
	}

	@Test
	@DisplayName("Record 1103: ZIP is 13208")
	void ZIPOfRecord1103() {
		assertEquals("13208", customers.get(1102).getZIP());
	}

	@Test
	@DisplayName("Record 1103: Phone is 315-471-5055")
	void PhoneOfRecord1103() {
		assertEquals("315-471-5055", customers.get(1102).getPhone());
	}

	@Test
	@DisplayName("Record 1103: Fax is 315-471-5452")
	void FaxOfRecord1103() {
		assertEquals("315-471-5452", customers.get(1102).getFax());
	}

	@Test
	@DisplayName("Record 1103: Email is jacklyn@negrete.com")
	void EmailOfRecord1103() {
		assertEquals("jacklyn@negrete.com", customers.get(1102).getEmail());
	}

	@Test
	@DisplayName("Record 1103: Web is http://www.jacklynnegrete.com")
	void WebOfRecord1103() {
		assertEquals("http://www.jacklynnegrete.com", customers.get(1102).getWeb());
	}
}
