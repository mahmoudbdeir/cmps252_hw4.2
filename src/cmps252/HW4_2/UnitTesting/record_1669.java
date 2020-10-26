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
class Record_1669 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1669: FirstName is Mitchell")
	void FirstNameOfRecord1669() {
		assertEquals("Mitchell", customers.get(1668).getFirstName());
	}

	@Test
	@DisplayName("Record 1669: LastName is Messa")
	void LastNameOfRecord1669() {
		assertEquals("Messa", customers.get(1668).getLastName());
	}

	@Test
	@DisplayName("Record 1669: Company is Buds Sign Shop")
	void CompanyOfRecord1669() {
		assertEquals("Buds Sign Shop", customers.get(1668).getCompany());
	}

	@Test
	@DisplayName("Record 1669: Address is 1800 Capitol Ave")
	void AddressOfRecord1669() {
		assertEquals("1800 Capitol Ave", customers.get(1668).getAddress());
	}

	@Test
	@DisplayName("Record 1669: City is Cheyenne")
	void CityOfRecord1669() {
		assertEquals("Cheyenne", customers.get(1668).getCity());
	}

	@Test
	@DisplayName("Record 1669: County is Laramie")
	void CountyOfRecord1669() {
		assertEquals("Laramie", customers.get(1668).getCounty());
	}

	@Test
	@DisplayName("Record 1669: State is WY")
	void StateOfRecord1669() {
		assertEquals("WY", customers.get(1668).getState());
	}

	@Test
	@DisplayName("Record 1669: ZIP is 82001")
	void ZIPOfRecord1669() {
		assertEquals("82001", customers.get(1668).getZIP());
	}

	@Test
	@DisplayName("Record 1669: Phone is 307-635-1820")
	void PhoneOfRecord1669() {
		assertEquals("307-635-1820", customers.get(1668).getPhone());
	}

	@Test
	@DisplayName("Record 1669: Fax is 307-635-6969")
	void FaxOfRecord1669() {
		assertEquals("307-635-6969", customers.get(1668).getFax());
	}

	@Test
	@DisplayName("Record 1669: Email is mitchell@messa.com")
	void EmailOfRecord1669() {
		assertEquals("mitchell@messa.com", customers.get(1668).getEmail());
	}

	@Test
	@DisplayName("Record 1669: Web is http://www.mitchellmessa.com")
	void WebOfRecord1669() {
		assertEquals("http://www.mitchellmessa.com", customers.get(1668).getWeb());
	}
}
