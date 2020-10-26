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

@Tag("40")
class Record_456 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 456: FirstName is Lorraine")
	void FirstNameOfRecord456() {
		assertEquals("Lorraine", customers.get(455).getFirstName());
	}

	@Test
	@DisplayName("Record 456: LastName is Markland")
	void LastNameOfRecord456() {
		assertEquals("Markland", customers.get(455).getLastName());
	}

	@Test
	@DisplayName("Record 456: Company is Hills, James L Esq")
	void CompanyOfRecord456() {
		assertEquals("Hills, James L Esq", customers.get(455).getCompany());
	}

	@Test
	@DisplayName("Record 456: Address is 12967 Ship Ct")
	void AddressOfRecord456() {
		assertEquals("12967 Ship Ct", customers.get(455).getAddress());
	}

	@Test
	@DisplayName("Record 456: City is Lusby")
	void CityOfRecord456() {
		assertEquals("Lusby", customers.get(455).getCity());
	}

	@Test
	@DisplayName("Record 456: County is Calvert")
	void CountyOfRecord456() {
		assertEquals("Calvert", customers.get(455).getCounty());
	}

	@Test
	@DisplayName("Record 456: State is MD")
	void StateOfRecord456() {
		assertEquals("MD", customers.get(455).getState());
	}

	@Test
	@DisplayName("Record 456: ZIP is 20657")
	void ZIPOfRecord456() {
		assertEquals("20657", customers.get(455).getZIP());
	}

	@Test
	@DisplayName("Record 456: Phone is 410-326-6175")
	void PhoneOfRecord456() {
		assertEquals("410-326-6175", customers.get(455).getPhone());
	}

	@Test
	@DisplayName("Record 456: Fax is 410-326-5799")
	void FaxOfRecord456() {
		assertEquals("410-326-5799", customers.get(455).getFax());
	}

	@Test
	@DisplayName("Record 456: Email is lorraine@markland.com")
	void EmailOfRecord456() {
		assertEquals("lorraine@markland.com", customers.get(455).getEmail());
	}

	@Test
	@DisplayName("Record 456: Web is http://www.lorrainemarkland.com")
	void WebOfRecord456() {
		assertEquals("http://www.lorrainemarkland.com", customers.get(455).getWeb());
	}
}
