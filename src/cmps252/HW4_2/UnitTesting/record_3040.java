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

@Tag("24")
class Record_3040 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3040: FirstName is Lucia")
	void FirstNameOfRecord3040() {
		assertEquals("Lucia", customers.get(3039).getFirstName());
	}

	@Test
	@DisplayName("Record 3040: LastName is Eversman")
	void LastNameOfRecord3040() {
		assertEquals("Eversman", customers.get(3039).getLastName());
	}

	@Test
	@DisplayName("Record 3040: Company is Jane Phelan Studio Boutique")
	void CompanyOfRecord3040() {
		assertEquals("Jane Phelan Studio Boutique", customers.get(3039).getCompany());
	}

	@Test
	@DisplayName("Record 3040: Address is 1123 E Northeast Loop  #-323")
	void AddressOfRecord3040() {
		assertEquals("1123 E Northeast Loop  #-323", customers.get(3039).getAddress());
	}

	@Test
	@DisplayName("Record 3040: City is Tyler")
	void CityOfRecord3040() {
		assertEquals("Tyler", customers.get(3039).getCity());
	}

	@Test
	@DisplayName("Record 3040: County is Smith")
	void CountyOfRecord3040() {
		assertEquals("Smith", customers.get(3039).getCounty());
	}

	@Test
	@DisplayName("Record 3040: State is TX")
	void StateOfRecord3040() {
		assertEquals("TX", customers.get(3039).getState());
	}

	@Test
	@DisplayName("Record 3040: ZIP is 75708")
	void ZIPOfRecord3040() {
		assertEquals("75708", customers.get(3039).getZIP());
	}

	@Test
	@DisplayName("Record 3040: Phone is 903-595-0873")
	void PhoneOfRecord3040() {
		assertEquals("903-595-0873", customers.get(3039).getPhone());
	}

	@Test
	@DisplayName("Record 3040: Fax is 903-595-2299")
	void FaxOfRecord3040() {
		assertEquals("903-595-2299", customers.get(3039).getFax());
	}

	@Test
	@DisplayName("Record 3040: Email is lucia@eversman.com")
	void EmailOfRecord3040() {
		assertEquals("lucia@eversman.com", customers.get(3039).getEmail());
	}

	@Test
	@DisplayName("Record 3040: Web is http://www.luciaeversman.com")
	void WebOfRecord3040() {
		assertEquals("http://www.luciaeversman.com", customers.get(3039).getWeb());
	}
}
