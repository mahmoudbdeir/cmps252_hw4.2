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

@Tag("3")
class Record_1377 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1377: FirstName is Millicent")
	void FirstNameOfRecord1377() {
		assertEquals("Millicent", customers.get(1376).getFirstName());
	}

	@Test
	@DisplayName("Record 1377: LastName is Alpers")
	void LastNameOfRecord1377() {
		assertEquals("Alpers", customers.get(1376).getLastName());
	}

	@Test
	@DisplayName("Record 1377: Company is Hughes Thoreen & Knapp")
	void CompanyOfRecord1377() {
		assertEquals("Hughes Thoreen & Knapp", customers.get(1376).getCompany());
	}

	@Test
	@DisplayName("Record 1377: Address is 664 S Evergreen Ave")
	void AddressOfRecord1377() {
		assertEquals("664 S Evergreen Ave", customers.get(1376).getAddress());
	}

	@Test
	@DisplayName("Record 1377: City is Woodbury Hyghts")
	void CityOfRecord1377() {
		assertEquals("Woodbury Hyghts", customers.get(1376).getCity());
	}

	@Test
	@DisplayName("Record 1377: County is Gloucester")
	void CountyOfRecord1377() {
		assertEquals("Gloucester", customers.get(1376).getCounty());
	}

	@Test
	@DisplayName("Record 1377: State is NJ")
	void StateOfRecord1377() {
		assertEquals("NJ", customers.get(1376).getState());
	}

	@Test
	@DisplayName("Record 1377: ZIP is 8097")
	void ZIPOfRecord1377() {
		assertEquals("8097", customers.get(1376).getZIP());
	}

	@Test
	@DisplayName("Record 1377: Phone is 856-845-4523")
	void PhoneOfRecord1377() {
		assertEquals("856-845-4523", customers.get(1376).getPhone());
	}

	@Test
	@DisplayName("Record 1377: Fax is 856-845-2678")
	void FaxOfRecord1377() {
		assertEquals("856-845-2678", customers.get(1376).getFax());
	}

	@Test
	@DisplayName("Record 1377: Email is millicent@alpers.com")
	void EmailOfRecord1377() {
		assertEquals("millicent@alpers.com", customers.get(1376).getEmail());
	}

	@Test
	@DisplayName("Record 1377: Web is http://www.millicentalpers.com")
	void WebOfRecord1377() {
		assertEquals("http://www.millicentalpers.com", customers.get(1376).getWeb());
	}
}
