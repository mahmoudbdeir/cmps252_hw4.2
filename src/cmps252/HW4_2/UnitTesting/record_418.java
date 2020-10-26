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

@Tag("41")
class Record_418 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 418: FirstName is Ruben")
	void FirstNameOfRecord418() {
		assertEquals("Ruben", customers.get(417).getFirstName());
	}

	@Test
	@DisplayName("Record 418: LastName is Meanor")
	void LastNameOfRecord418() {
		assertEquals("Meanor", customers.get(417).getLastName());
	}

	@Test
	@DisplayName("Record 418: Company is Professional Service Ind Inc")
	void CompanyOfRecord418() {
		assertEquals("Professional Service Ind Inc", customers.get(417).getCompany());
	}

	@Test
	@DisplayName("Record 418: Address is 204 Montour Blvd")
	void AddressOfRecord418() {
		assertEquals("204 Montour Blvd", customers.get(417).getAddress());
	}

	@Test
	@DisplayName("Record 418: City is Bloomsburg")
	void CityOfRecord418() {
		assertEquals("Bloomsburg", customers.get(417).getCity());
	}

	@Test
	@DisplayName("Record 418: County is Columbia")
	void CountyOfRecord418() {
		assertEquals("Columbia", customers.get(417).getCounty());
	}

	@Test
	@DisplayName("Record 418: State is PA")
	void StateOfRecord418() {
		assertEquals("PA", customers.get(417).getState());
	}

	@Test
	@DisplayName("Record 418: ZIP is 17815")
	void ZIPOfRecord418() {
		assertEquals("17815", customers.get(417).getZIP());
	}

	@Test
	@DisplayName("Record 418: Phone is 570-387-9115")
	void PhoneOfRecord418() {
		assertEquals("570-387-9115", customers.get(417).getPhone());
	}

	@Test
	@DisplayName("Record 418: Fax is 570-387-3499")
	void FaxOfRecord418() {
		assertEquals("570-387-3499", customers.get(417).getFax());
	}

	@Test
	@DisplayName("Record 418: Email is ruben@meanor.com")
	void EmailOfRecord418() {
		assertEquals("ruben@meanor.com", customers.get(417).getEmail());
	}

	@Test
	@DisplayName("Record 418: Web is http://www.rubenmeanor.com")
	void WebOfRecord418() {
		assertEquals("http://www.rubenmeanor.com", customers.get(417).getWeb());
	}
}
