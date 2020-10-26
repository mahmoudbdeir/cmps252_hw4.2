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

@Tag("9")
class Record_67 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 67: FirstName is Leslie")
	void FirstNameOfRecord67() {
		assertEquals("Leslie", customers.get(66).getFirstName());
	}

	@Test
	@DisplayName("Record 67: LastName is Yoke")
	void LastNameOfRecord67() {
		assertEquals("Yoke", customers.get(66).getLastName());
	}

	@Test
	@DisplayName("Record 67: Company is Galloway & Qualmann Pa")
	void CompanyOfRecord67() {
		assertEquals("Galloway & Qualmann Pa", customers.get(66).getCompany());
	}

	@Test
	@DisplayName("Record 67: Address is 90 Porter Ave")
	void AddressOfRecord67() {
		assertEquals("90 Porter Ave", customers.get(66).getAddress());
	}

	@Test
	@DisplayName("Record 67: City is Brooklyn")
	void CityOfRecord67() {
		assertEquals("Brooklyn", customers.get(66).getCity());
	}

	@Test
	@DisplayName("Record 67: County is Kings")
	void CountyOfRecord67() {
		assertEquals("Kings", customers.get(66).getCounty());
	}

	@Test
	@DisplayName("Record 67: State is NY")
	void StateOfRecord67() {
		assertEquals("NY", customers.get(66).getState());
	}

	@Test
	@DisplayName("Record 67: ZIP is 11237")
	void ZIPOfRecord67() {
		assertEquals("11237", customers.get(66).getZIP());
	}

	@Test
	@DisplayName("Record 67: Phone is 718-366-2535")
	void PhoneOfRecord67() {
		assertEquals("718-366-2535", customers.get(66).getPhone());
	}

	@Test
	@DisplayName("Record 67: Fax is 718-366-7971")
	void FaxOfRecord67() {
		assertEquals("718-366-7971", customers.get(66).getFax());
	}

	@Test
	@DisplayName("Record 67: Email is leslie@yoke.com")
	void EmailOfRecord67() {
		assertEquals("leslie@yoke.com", customers.get(66).getEmail());
	}

	@Test
	@DisplayName("Record 67: Web is http://www.leslieyoke.com")
	void WebOfRecord67() {
		assertEquals("http://www.leslieyoke.com", customers.get(66).getWeb());
	}
}
