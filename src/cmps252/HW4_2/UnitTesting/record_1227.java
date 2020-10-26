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

@Tag("47")
class Record_1227 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1227: FirstName is Hai")
	void FirstNameOfRecord1227() {
		assertEquals("Hai", customers.get(1226).getFirstName());
	}

	@Test
	@DisplayName("Record 1227: LastName is Gicker")
	void LastNameOfRecord1227() {
		assertEquals("Gicker", customers.get(1226).getLastName());
	}

	@Test
	@DisplayName("Record 1227: Company is Miami Heart Institute")
	void CompanyOfRecord1227() {
		assertEquals("Miami Heart Institute", customers.get(1226).getCompany());
	}

	@Test
	@DisplayName("Record 1227: Address is 6250 Mccart Ave")
	void AddressOfRecord1227() {
		assertEquals("6250 Mccart Ave", customers.get(1226).getAddress());
	}

	@Test
	@DisplayName("Record 1227: City is Fort Worth")
	void CityOfRecord1227() {
		assertEquals("Fort Worth", customers.get(1226).getCity());
	}

	@Test
	@DisplayName("Record 1227: County is Tarrant")
	void CountyOfRecord1227() {
		assertEquals("Tarrant", customers.get(1226).getCounty());
	}

	@Test
	@DisplayName("Record 1227: State is TX")
	void StateOfRecord1227() {
		assertEquals("TX", customers.get(1226).getState());
	}

	@Test
	@DisplayName("Record 1227: ZIP is 76133")
	void ZIPOfRecord1227() {
		assertEquals("76133", customers.get(1226).getZIP());
	}

	@Test
	@DisplayName("Record 1227: Phone is 817-370-8303")
	void PhoneOfRecord1227() {
		assertEquals("817-370-8303", customers.get(1226).getPhone());
	}

	@Test
	@DisplayName("Record 1227: Fax is 817-370-7055")
	void FaxOfRecord1227() {
		assertEquals("817-370-7055", customers.get(1226).getFax());
	}

	@Test
	@DisplayName("Record 1227: Email is hai@gicker.com")
	void EmailOfRecord1227() {
		assertEquals("hai@gicker.com", customers.get(1226).getEmail());
	}

	@Test
	@DisplayName("Record 1227: Web is http://www.haigicker.com")
	void WebOfRecord1227() {
		assertEquals("http://www.haigicker.com", customers.get(1226).getWeb());
	}
}
