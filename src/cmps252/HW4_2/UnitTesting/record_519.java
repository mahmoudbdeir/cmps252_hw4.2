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

@Tag("0")
class Record_519 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 519: FirstName is Nichole")
	void FirstNameOfRecord519() {
		assertEquals("Nichole", customers.get(518).getFirstName());
	}

	@Test
	@DisplayName("Record 519: LastName is Laible")
	void LastNameOfRecord519() {
		assertEquals("Laible", customers.get(518).getLastName());
	}

	@Test
	@DisplayName("Record 519: Company is Anver Bioscience Design Inc")
	void CompanyOfRecord519() {
		assertEquals("Anver Bioscience Design Inc", customers.get(518).getCompany());
	}

	@Test
	@DisplayName("Record 519: Address is 5750 Davis Blvd  #-309")
	void AddressOfRecord519() {
		assertEquals("5750 Davis Blvd  #-309", customers.get(518).getAddress());
	}

	@Test
	@DisplayName("Record 519: City is North Richland Hills")
	void CityOfRecord519() {
		assertEquals("North Richland Hills", customers.get(518).getCity());
	}

	@Test
	@DisplayName("Record 519: County is Tarrant")
	void CountyOfRecord519() {
		assertEquals("Tarrant", customers.get(518).getCounty());
	}

	@Test
	@DisplayName("Record 519: State is TX")
	void StateOfRecord519() {
		assertEquals("TX", customers.get(518).getState());
	}

	@Test
	@DisplayName("Record 519: ZIP is 76180")
	void ZIPOfRecord519() {
		assertEquals("76180", customers.get(518).getZIP());
	}

	@Test
	@DisplayName("Record 519: Phone is 817-498-2882")
	void PhoneOfRecord519() {
		assertEquals("817-498-2882", customers.get(518).getPhone());
	}

	@Test
	@DisplayName("Record 519: Fax is 817-498-1463")
	void FaxOfRecord519() {
		assertEquals("817-498-1463", customers.get(518).getFax());
	}

	@Test
	@DisplayName("Record 519: Email is nichole@laible.com")
	void EmailOfRecord519() {
		assertEquals("nichole@laible.com", customers.get(518).getEmail());
	}

	@Test
	@DisplayName("Record 519: Web is http://www.nicholelaible.com")
	void WebOfRecord519() {
		assertEquals("http://www.nicholelaible.com", customers.get(518).getWeb());
	}
}
