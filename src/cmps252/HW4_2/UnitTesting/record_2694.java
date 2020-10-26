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

@Tag("14")
class Record_2694 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2694: FirstName is Camilla")
	void FirstNameOfRecord2694() {
		assertEquals("Camilla", customers.get(2693).getFirstName());
	}

	@Test
	@DisplayName("Record 2694: LastName is Stults")
	void LastNameOfRecord2694() {
		assertEquals("Stults", customers.get(2693).getLastName());
	}

	@Test
	@DisplayName("Record 2694: Company is Stanton Building Specialties")
	void CompanyOfRecord2694() {
		assertEquals("Stanton Building Specialties", customers.get(2693).getCompany());
	}

	@Test
	@DisplayName("Record 2694: Address is 625 Delaware St")
	void AddressOfRecord2694() {
		assertEquals("625 Delaware St", customers.get(2693).getAddress());
	}

	@Test
	@DisplayName("Record 2694: City is New Castle")
	void CityOfRecord2694() {
		assertEquals("New Castle", customers.get(2693).getCity());
	}

	@Test
	@DisplayName("Record 2694: County is New Castle")
	void CountyOfRecord2694() {
		assertEquals("New Castle", customers.get(2693).getCounty());
	}

	@Test
	@DisplayName("Record 2694: State is DE")
	void StateOfRecord2694() {
		assertEquals("DE", customers.get(2693).getState());
	}

	@Test
	@DisplayName("Record 2694: ZIP is 19720")
	void ZIPOfRecord2694() {
		assertEquals("19720", customers.get(2693).getZIP());
	}

	@Test
	@DisplayName("Record 2694: Phone is 302-323-8604")
	void PhoneOfRecord2694() {
		assertEquals("302-323-8604", customers.get(2693).getPhone());
	}

	@Test
	@DisplayName("Record 2694: Fax is 302-323-2733")
	void FaxOfRecord2694() {
		assertEquals("302-323-2733", customers.get(2693).getFax());
	}

	@Test
	@DisplayName("Record 2694: Email is camilla@stults.com")
	void EmailOfRecord2694() {
		assertEquals("camilla@stults.com", customers.get(2693).getEmail());
	}

	@Test
	@DisplayName("Record 2694: Web is http://www.camillastults.com")
	void WebOfRecord2694() {
		assertEquals("http://www.camillastults.com", customers.get(2693).getWeb());
	}
}
