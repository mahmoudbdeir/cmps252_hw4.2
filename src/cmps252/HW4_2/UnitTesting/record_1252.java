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

@Tag("2")
class Record_1252 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1252: FirstName is Franklin")
	void FirstNameOfRecord1252() {
		assertEquals("Franklin", customers.get(1251).getFirstName());
	}

	@Test
	@DisplayName("Record 1252: LastName is Saults")
	void LastNameOfRecord1252() {
		assertEquals("Saults", customers.get(1251).getLastName());
	}

	@Test
	@DisplayName("Record 1252: Company is Welsh, Carol Esq")
	void CompanyOfRecord1252() {
		assertEquals("Welsh, Carol Esq", customers.get(1251).getCompany());
	}

	@Test
	@DisplayName("Record 1252: Address is 870 Market St")
	void AddressOfRecord1252() {
		assertEquals("870 Market St", customers.get(1251).getAddress());
	}

	@Test
	@DisplayName("Record 1252: City is San Francisco")
	void CityOfRecord1252() {
		assertEquals("San Francisco", customers.get(1251).getCity());
	}

	@Test
	@DisplayName("Record 1252: County is San Francisco")
	void CountyOfRecord1252() {
		assertEquals("San Francisco", customers.get(1251).getCounty());
	}

	@Test
	@DisplayName("Record 1252: State is CA")
	void StateOfRecord1252() {
		assertEquals("CA", customers.get(1251).getState());
	}

	@Test
	@DisplayName("Record 1252: ZIP is 94102")
	void ZIPOfRecord1252() {
		assertEquals("94102", customers.get(1251).getZIP());
	}

	@Test
	@DisplayName("Record 1252: Phone is 415-834-9768")
	void PhoneOfRecord1252() {
		assertEquals("415-834-9768", customers.get(1251).getPhone());
	}

	@Test
	@DisplayName("Record 1252: Fax is 415-834-7216")
	void FaxOfRecord1252() {
		assertEquals("415-834-7216", customers.get(1251).getFax());
	}

	@Test
	@DisplayName("Record 1252: Email is franklin@saults.com")
	void EmailOfRecord1252() {
		assertEquals("franklin@saults.com", customers.get(1251).getEmail());
	}

	@Test
	@DisplayName("Record 1252: Web is http://www.franklinsaults.com")
	void WebOfRecord1252() {
		assertEquals("http://www.franklinsaults.com", customers.get(1251).getWeb());
	}
}
