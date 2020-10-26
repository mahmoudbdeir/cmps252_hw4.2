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

@Tag("35")
class Record_3837 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3837: FirstName is Ofelia")
	void FirstNameOfRecord3837() {
		assertEquals("Ofelia", customers.get(3836).getFirstName());
	}

	@Test
	@DisplayName("Record 3837: LastName is Delaune")
	void LastNameOfRecord3837() {
		assertEquals("Delaune", customers.get(3836).getLastName());
	}

	@Test
	@DisplayName("Record 3837: Company is Groundwater Technology Inc")
	void CompanyOfRecord3837() {
		assertEquals("Groundwater Technology Inc", customers.get(3836).getCompany());
	}

	@Test
	@DisplayName("Record 3837: Address is 925 Euclid Ave")
	void AddressOfRecord3837() {
		assertEquals("925 Euclid Ave", customers.get(3836).getAddress());
	}

	@Test
	@DisplayName("Record 3837: City is Cleveland")
	void CityOfRecord3837() {
		assertEquals("Cleveland", customers.get(3836).getCity());
	}

	@Test
	@DisplayName("Record 3837: County is Cuyahoga")
	void CountyOfRecord3837() {
		assertEquals("Cuyahoga", customers.get(3836).getCounty());
	}

	@Test
	@DisplayName("Record 3837: State is OH")
	void StateOfRecord3837() {
		assertEquals("OH", customers.get(3836).getState());
	}

	@Test
	@DisplayName("Record 3837: ZIP is 44115")
	void ZIPOfRecord3837() {
		assertEquals("44115", customers.get(3836).getZIP());
	}

	@Test
	@DisplayName("Record 3837: Phone is 216-621-3841")
	void PhoneOfRecord3837() {
		assertEquals("216-621-3841", customers.get(3836).getPhone());
	}

	@Test
	@DisplayName("Record 3837: Fax is 216-621-5541")
	void FaxOfRecord3837() {
		assertEquals("216-621-5541", customers.get(3836).getFax());
	}

	@Test
	@DisplayName("Record 3837: Email is ofelia@delaune.com")
	void EmailOfRecord3837() {
		assertEquals("ofelia@delaune.com", customers.get(3836).getEmail());
	}

	@Test
	@DisplayName("Record 3837: Web is http://www.ofeliadelaune.com")
	void WebOfRecord3837() {
		assertEquals("http://www.ofeliadelaune.com", customers.get(3836).getWeb());
	}
}
