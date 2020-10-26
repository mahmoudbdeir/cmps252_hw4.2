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
class Record_708 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 708: FirstName is Elena")
	void FirstNameOfRecord708() {
		assertEquals("Elena", customers.get(707).getFirstName());
	}

	@Test
	@DisplayName("Record 708: LastName is Saraceno")
	void LastNameOfRecord708() {
		assertEquals("Saraceno", customers.get(707).getLastName());
	}

	@Test
	@DisplayName("Record 708: Company is Colonial Cakes")
	void CompanyOfRecord708() {
		assertEquals("Colonial Cakes", customers.get(707).getCompany());
	}

	@Test
	@DisplayName("Record 708: Address is 3599 Warburton Ave")
	void AddressOfRecord708() {
		assertEquals("3599 Warburton Ave", customers.get(707).getAddress());
	}

	@Test
	@DisplayName("Record 708: City is Santa Clara")
	void CityOfRecord708() {
		assertEquals("Santa Clara", customers.get(707).getCity());
	}

	@Test
	@DisplayName("Record 708: County is Santa Clara")
	void CountyOfRecord708() {
		assertEquals("Santa Clara", customers.get(707).getCounty());
	}

	@Test
	@DisplayName("Record 708: State is CA")
	void StateOfRecord708() {
		assertEquals("CA", customers.get(707).getState());
	}

	@Test
	@DisplayName("Record 708: ZIP is 95051")
	void ZIPOfRecord708() {
		assertEquals("95051", customers.get(707).getZIP());
	}

	@Test
	@DisplayName("Record 708: Phone is 408-241-1255")
	void PhoneOfRecord708() {
		assertEquals("408-241-1255", customers.get(707).getPhone());
	}

	@Test
	@DisplayName("Record 708: Fax is 408-241-5552")
	void FaxOfRecord708() {
		assertEquals("408-241-5552", customers.get(707).getFax());
	}

	@Test
	@DisplayName("Record 708: Email is elena@saraceno.com")
	void EmailOfRecord708() {
		assertEquals("elena@saraceno.com", customers.get(707).getEmail());
	}

	@Test
	@DisplayName("Record 708: Web is http://www.elenasaraceno.com")
	void WebOfRecord708() {
		assertEquals("http://www.elenasaraceno.com", customers.get(707).getWeb());
	}
}
