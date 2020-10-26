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

@Tag("46")
class Record_3552 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3552: FirstName is Delois")
	void FirstNameOfRecord3552() {
		assertEquals("Delois", customers.get(3551).getFirstName());
	}

	@Test
	@DisplayName("Record 3552: LastName is Jorge")
	void LastNameOfRecord3552() {
		assertEquals("Jorge", customers.get(3551).getLastName());
	}

	@Test
	@DisplayName("Record 3552: Company is Hixson, Marcia L Md")
	void CompanyOfRecord3552() {
		assertEquals("Hixson, Marcia L Md", customers.get(3551).getCompany());
	}

	@Test
	@DisplayName("Record 3552: Address is 357 Asbury Rd")
	void AddressOfRecord3552() {
		assertEquals("357 Asbury Rd", customers.get(3551).getAddress());
	}

	@Test
	@DisplayName("Record 3552: City is Farmingdale")
	void CityOfRecord3552() {
		assertEquals("Farmingdale", customers.get(3551).getCity());
	}

	@Test
	@DisplayName("Record 3552: County is Monmouth")
	void CountyOfRecord3552() {
		assertEquals("Monmouth", customers.get(3551).getCounty());
	}

	@Test
	@DisplayName("Record 3552: State is NJ")
	void StateOfRecord3552() {
		assertEquals("NJ", customers.get(3551).getState());
	}

	@Test
	@DisplayName("Record 3552: ZIP is 7727")
	void ZIPOfRecord3552() {
		assertEquals("7727", customers.get(3551).getZIP());
	}

	@Test
	@DisplayName("Record 3552: Phone is 732-938-5299")
	void PhoneOfRecord3552() {
		assertEquals("732-938-5299", customers.get(3551).getPhone());
	}

	@Test
	@DisplayName("Record 3552: Fax is 732-938-2661")
	void FaxOfRecord3552() {
		assertEquals("732-938-2661", customers.get(3551).getFax());
	}

	@Test
	@DisplayName("Record 3552: Email is delois@jorge.com")
	void EmailOfRecord3552() {
		assertEquals("delois@jorge.com", customers.get(3551).getEmail());
	}

	@Test
	@DisplayName("Record 3552: Web is http://www.deloisjorge.com")
	void WebOfRecord3552() {
		assertEquals("http://www.deloisjorge.com", customers.get(3551).getWeb());
	}
}
