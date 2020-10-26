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

@Tag("32")
class Record_3978 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3978: FirstName is Gustavo")
	void FirstNameOfRecord3978() {
		assertEquals("Gustavo", customers.get(3977).getFirstName());
	}

	@Test
	@DisplayName("Record 3978: LastName is Gallosa")
	void LastNameOfRecord3978() {
		assertEquals("Gallosa", customers.get(3977).getLastName());
	}

	@Test
	@DisplayName("Record 3978: Company is Roy Wong Md Camino Medical Grp")
	void CompanyOfRecord3978() {
		assertEquals("Roy Wong Md Camino Medical Grp", customers.get(3977).getCompany());
	}

	@Test
	@DisplayName("Record 3978: Address is 3840 Lagrange St")
	void AddressOfRecord3978() {
		assertEquals("3840 Lagrange St", customers.get(3977).getAddress());
	}

	@Test
	@DisplayName("Record 3978: City is Toledo")
	void CityOfRecord3978() {
		assertEquals("Toledo", customers.get(3977).getCity());
	}

	@Test
	@DisplayName("Record 3978: County is Lucas")
	void CountyOfRecord3978() {
		assertEquals("Lucas", customers.get(3977).getCounty());
	}

	@Test
	@DisplayName("Record 3978: State is OH")
	void StateOfRecord3978() {
		assertEquals("OH", customers.get(3977).getState());
	}

	@Test
	@DisplayName("Record 3978: ZIP is 43612")
	void ZIPOfRecord3978() {
		assertEquals("43612", customers.get(3977).getZIP());
	}

	@Test
	@DisplayName("Record 3978: Phone is 419-476-2794")
	void PhoneOfRecord3978() {
		assertEquals("419-476-2794", customers.get(3977).getPhone());
	}

	@Test
	@DisplayName("Record 3978: Fax is 419-476-2727")
	void FaxOfRecord3978() {
		assertEquals("419-476-2727", customers.get(3977).getFax());
	}

	@Test
	@DisplayName("Record 3978: Email is gustavo@gallosa.com")
	void EmailOfRecord3978() {
		assertEquals("gustavo@gallosa.com", customers.get(3977).getEmail());
	}

	@Test
	@DisplayName("Record 3978: Web is http://www.gustavogallosa.com")
	void WebOfRecord3978() {
		assertEquals("http://www.gustavogallosa.com", customers.get(3977).getWeb());
	}
}
