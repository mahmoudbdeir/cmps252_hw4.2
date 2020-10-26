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

@Tag("14")
class Record_3243 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3243: FirstName is Donnie")
	void FirstNameOfRecord3243() {
		assertEquals("Donnie", customers.get(3242).getFirstName());
	}

	@Test
	@DisplayName("Record 3243: LastName is Briggs")
	void LastNameOfRecord3243() {
		assertEquals("Briggs", customers.get(3242).getLastName());
	}

	@Test
	@DisplayName("Record 3243: Company is B S & E Co Inc")
	void CompanyOfRecord3243() {
		assertEquals("B S & E Co Inc", customers.get(3242).getCompany());
	}

	@Test
	@DisplayName("Record 3243: Address is 142 Midland Ave")
	void AddressOfRecord3243() {
		assertEquals("142 Midland Ave", customers.get(3242).getAddress());
	}

	@Test
	@DisplayName("Record 3243: City is Kearny")
	void CityOfRecord3243() {
		assertEquals("Kearny", customers.get(3242).getCity());
	}

	@Test
	@DisplayName("Record 3243: County is Hudson")
	void CountyOfRecord3243() {
		assertEquals("Hudson", customers.get(3242).getCounty());
	}

	@Test
	@DisplayName("Record 3243: State is NJ")
	void StateOfRecord3243() {
		assertEquals("NJ", customers.get(3242).getState());
	}

	@Test
	@DisplayName("Record 3243: ZIP is 7032")
	void ZIPOfRecord3243() {
		assertEquals("7032", customers.get(3242).getZIP());
	}

	@Test
	@DisplayName("Record 3243: Phone is 201-998-6349")
	void PhoneOfRecord3243() {
		assertEquals("201-998-6349", customers.get(3242).getPhone());
	}

	@Test
	@DisplayName("Record 3243: Fax is 201-998-7443")
	void FaxOfRecord3243() {
		assertEquals("201-998-7443", customers.get(3242).getFax());
	}

	@Test
	@DisplayName("Record 3243: Email is donnie@briggs.com")
	void EmailOfRecord3243() {
		assertEquals("donnie@briggs.com", customers.get(3242).getEmail());
	}

	@Test
	@DisplayName("Record 3243: Web is http://www.donniebriggs.com")
	void WebOfRecord3243() {
		assertEquals("http://www.donniebriggs.com", customers.get(3242).getWeb());
	}
}
