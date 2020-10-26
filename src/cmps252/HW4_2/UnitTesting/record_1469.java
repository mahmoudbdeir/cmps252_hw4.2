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

@Tag("34")
class Record_1469 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1469: FirstName is Kent")
	void FirstNameOfRecord1469() {
		assertEquals("Kent", customers.get(1468).getFirstName());
	}

	@Test
	@DisplayName("Record 1469: LastName is Hermanowicz")
	void LastNameOfRecord1469() {
		assertEquals("Hermanowicz", customers.get(1468).getLastName());
	}

	@Test
	@DisplayName("Record 1469: Company is Bezler, Janet M Esq")
	void CompanyOfRecord1469() {
		assertEquals("Bezler, Janet M Esq", customers.get(1468).getCompany());
	}

	@Test
	@DisplayName("Record 1469: Address is 22405 72nd Ave S")
	void AddressOfRecord1469() {
		assertEquals("22405 72nd Ave S", customers.get(1468).getAddress());
	}

	@Test
	@DisplayName("Record 1469: City is Kent")
	void CityOfRecord1469() {
		assertEquals("Kent", customers.get(1468).getCity());
	}

	@Test
	@DisplayName("Record 1469: County is King")
	void CountyOfRecord1469() {
		assertEquals("King", customers.get(1468).getCounty());
	}

	@Test
	@DisplayName("Record 1469: State is WA")
	void StateOfRecord1469() {
		assertEquals("WA", customers.get(1468).getState());
	}

	@Test
	@DisplayName("Record 1469: ZIP is 98032")
	void ZIPOfRecord1469() {
		assertEquals("98032", customers.get(1468).getZIP());
	}

	@Test
	@DisplayName("Record 1469: Phone is 206-872-5897")
	void PhoneOfRecord1469() {
		assertEquals("206-872-5897", customers.get(1468).getPhone());
	}

	@Test
	@DisplayName("Record 1469: Fax is 206-872-0622")
	void FaxOfRecord1469() {
		assertEquals("206-872-0622", customers.get(1468).getFax());
	}

	@Test
	@DisplayName("Record 1469: Email is kent@hermanowicz.com")
	void EmailOfRecord1469() {
		assertEquals("kent@hermanowicz.com", customers.get(1468).getEmail());
	}

	@Test
	@DisplayName("Record 1469: Web is http://www.kenthermanowicz.com")
	void WebOfRecord1469() {
		assertEquals("http://www.kenthermanowicz.com", customers.get(1468).getWeb());
	}
}
