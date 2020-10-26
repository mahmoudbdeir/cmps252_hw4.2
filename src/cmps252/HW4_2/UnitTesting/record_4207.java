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

@Tag("29")
class Record_4207 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4207: FirstName is Anna")
	void FirstNameOfRecord4207() {
		assertEquals("Anna", customers.get(4206).getFirstName());
	}

	@Test
	@DisplayName("Record 4207: LastName is Hopps")
	void LastNameOfRecord4207() {
		assertEquals("Hopps", customers.get(4206).getLastName());
	}

	@Test
	@DisplayName("Record 4207: Company is Mahaffey Equipment Division")
	void CompanyOfRecord4207() {
		assertEquals("Mahaffey Equipment Division", customers.get(4206).getCompany());
	}

	@Test
	@DisplayName("Record 4207: Address is 710 Bergen Ave")
	void AddressOfRecord4207() {
		assertEquals("710 Bergen Ave", customers.get(4206).getAddress());
	}

	@Test
	@DisplayName("Record 4207: City is Jersey City")
	void CityOfRecord4207() {
		assertEquals("Jersey City", customers.get(4206).getCity());
	}

	@Test
	@DisplayName("Record 4207: County is Hudson")
	void CountyOfRecord4207() {
		assertEquals("Hudson", customers.get(4206).getCounty());
	}

	@Test
	@DisplayName("Record 4207: State is NJ")
	void StateOfRecord4207() {
		assertEquals("NJ", customers.get(4206).getState());
	}

	@Test
	@DisplayName("Record 4207: ZIP is 7306")
	void ZIPOfRecord4207() {
		assertEquals("7306", customers.get(4206).getZIP());
	}

	@Test
	@DisplayName("Record 4207: Phone is 201-451-1187")
	void PhoneOfRecord4207() {
		assertEquals("201-451-1187", customers.get(4206).getPhone());
	}

	@Test
	@DisplayName("Record 4207: Fax is 201-451-2107")
	void FaxOfRecord4207() {
		assertEquals("201-451-2107", customers.get(4206).getFax());
	}

	@Test
	@DisplayName("Record 4207: Email is anna@hopps.com")
	void EmailOfRecord4207() {
		assertEquals("anna@hopps.com", customers.get(4206).getEmail());
	}

	@Test
	@DisplayName("Record 4207: Web is http://www.annahopps.com")
	void WebOfRecord4207() {
		assertEquals("http://www.annahopps.com", customers.get(4206).getWeb());
	}
}
