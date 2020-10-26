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

@Tag("1")
class Record_4553 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4553: FirstName is Monica")
	void FirstNameOfRecord4553() {
		assertEquals("Monica", customers.get(4552).getFirstName());
	}

	@Test
	@DisplayName("Record 4553: LastName is Barmer")
	void LastNameOfRecord4553() {
		assertEquals("Barmer", customers.get(4552).getLastName());
	}

	@Test
	@DisplayName("Record 4553: Company is Collins Body Shop")
	void CompanyOfRecord4553() {
		assertEquals("Collins Body Shop", customers.get(4552).getCompany());
	}

	@Test
	@DisplayName("Record 4553: Address is 33 Wood Ave S")
	void AddressOfRecord4553() {
		assertEquals("33 Wood Ave S", customers.get(4552).getAddress());
	}

	@Test
	@DisplayName("Record 4553: City is Iselin")
	void CityOfRecord4553() {
		assertEquals("Iselin", customers.get(4552).getCity());
	}

	@Test
	@DisplayName("Record 4553: County is Middlesex")
	void CountyOfRecord4553() {
		assertEquals("Middlesex", customers.get(4552).getCounty());
	}

	@Test
	@DisplayName("Record 4553: State is NJ")
	void StateOfRecord4553() {
		assertEquals("NJ", customers.get(4552).getState());
	}

	@Test
	@DisplayName("Record 4553: ZIP is 8830")
	void ZIPOfRecord4553() {
		assertEquals("8830", customers.get(4552).getZIP());
	}

	@Test
	@DisplayName("Record 4553: Phone is 732-548-1573")
	void PhoneOfRecord4553() {
		assertEquals("732-548-1573", customers.get(4552).getPhone());
	}

	@Test
	@DisplayName("Record 4553: Fax is 732-548-1174")
	void FaxOfRecord4553() {
		assertEquals("732-548-1174", customers.get(4552).getFax());
	}

	@Test
	@DisplayName("Record 4553: Email is monica@barmer.com")
	void EmailOfRecord4553() {
		assertEquals("monica@barmer.com", customers.get(4552).getEmail());
	}

	@Test
	@DisplayName("Record 4553: Web is http://www.monicabarmer.com")
	void WebOfRecord4553() {
		assertEquals("http://www.monicabarmer.com", customers.get(4552).getWeb());
	}
}
