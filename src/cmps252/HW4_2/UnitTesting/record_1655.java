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

@Tag("48")
class Record_1655 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1655: FirstName is Carmen")
	void FirstNameOfRecord1655() {
		assertEquals("Carmen", customers.get(1654).getFirstName());
	}

	@Test
	@DisplayName("Record 1655: LastName is Jackowiak")
	void LastNameOfRecord1655() {
		assertEquals("Jackowiak", customers.get(1654).getLastName());
	}

	@Test
	@DisplayName("Record 1655: Company is Brenco Supply Inc")
	void CompanyOfRecord1655() {
		assertEquals("Brenco Supply Inc", customers.get(1654).getCompany());
	}

	@Test
	@DisplayName("Record 1655: Address is 200 Dewitt Rd")
	void AddressOfRecord1655() {
		assertEquals("200 Dewitt Rd", customers.get(1654).getAddress());
	}

	@Test
	@DisplayName("Record 1655: City is Syracuse")
	void CityOfRecord1655() {
		assertEquals("Syracuse", customers.get(1654).getCity());
	}

	@Test
	@DisplayName("Record 1655: County is Onondaga")
	void CountyOfRecord1655() {
		assertEquals("Onondaga", customers.get(1654).getCounty());
	}

	@Test
	@DisplayName("Record 1655: State is NY")
	void StateOfRecord1655() {
		assertEquals("NY", customers.get(1654).getState());
	}

	@Test
	@DisplayName("Record 1655: ZIP is 13214")
	void ZIPOfRecord1655() {
		assertEquals("13214", customers.get(1654).getZIP());
	}

	@Test
	@DisplayName("Record 1655: Phone is 315-445-9588")
	void PhoneOfRecord1655() {
		assertEquals("315-445-9588", customers.get(1654).getPhone());
	}

	@Test
	@DisplayName("Record 1655: Fax is 315-445-4359")
	void FaxOfRecord1655() {
		assertEquals("315-445-4359", customers.get(1654).getFax());
	}

	@Test
	@DisplayName("Record 1655: Email is carmen@jackowiak.com")
	void EmailOfRecord1655() {
		assertEquals("carmen@jackowiak.com", customers.get(1654).getEmail());
	}

	@Test
	@DisplayName("Record 1655: Web is http://www.carmenjackowiak.com")
	void WebOfRecord1655() {
		assertEquals("http://www.carmenjackowiak.com", customers.get(1654).getWeb());
	}
}
