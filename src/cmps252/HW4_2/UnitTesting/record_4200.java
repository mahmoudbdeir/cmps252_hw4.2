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
class Record_4200 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4200: FirstName is Kory")
	void FirstNameOfRecord4200() {
		assertEquals("Kory", customers.get(4199).getFirstName());
	}

	@Test
	@DisplayName("Record 4200: LastName is Lessard")
	void LastNameOfRecord4200() {
		assertEquals("Lessard", customers.get(4199).getLastName());
	}

	@Test
	@DisplayName("Record 4200: Company is Upstate Abstract Of Ny Inc")
	void CompanyOfRecord4200() {
		assertEquals("Upstate Abstract Of Ny Inc", customers.get(4199).getCompany());
	}

	@Test
	@DisplayName("Record 4200: Address is 603 S Washington Ave")
	void AddressOfRecord4200() {
		assertEquals("603 S Washington Ave", customers.get(4199).getAddress());
	}

	@Test
	@DisplayName("Record 4200: City is Lansing")
	void CityOfRecord4200() {
		assertEquals("Lansing", customers.get(4199).getCity());
	}

	@Test
	@DisplayName("Record 4200: County is Ingham")
	void CountyOfRecord4200() {
		assertEquals("Ingham", customers.get(4199).getCounty());
	}

	@Test
	@DisplayName("Record 4200: State is MI")
	void StateOfRecord4200() {
		assertEquals("MI", customers.get(4199).getState());
	}

	@Test
	@DisplayName("Record 4200: ZIP is 48933")
	void ZIPOfRecord4200() {
		assertEquals("48933", customers.get(4199).getZIP());
	}

	@Test
	@DisplayName("Record 4200: Phone is 517-372-0910")
	void PhoneOfRecord4200() {
		assertEquals("517-372-0910", customers.get(4199).getPhone());
	}

	@Test
	@DisplayName("Record 4200: Fax is 517-372-2739")
	void FaxOfRecord4200() {
		assertEquals("517-372-2739", customers.get(4199).getFax());
	}

	@Test
	@DisplayName("Record 4200: Email is kory@lessard.com")
	void EmailOfRecord4200() {
		assertEquals("kory@lessard.com", customers.get(4199).getEmail());
	}

	@Test
	@DisplayName("Record 4200: Web is http://www.korylessard.com")
	void WebOfRecord4200() {
		assertEquals("http://www.korylessard.com", customers.get(4199).getWeb());
	}
}
