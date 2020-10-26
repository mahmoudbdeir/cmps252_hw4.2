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
class Record_1167 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1167: FirstName is Kysha")
	void FirstNameOfRecord1167() {
		assertEquals("Kysha", customers.get(1166).getFirstName());
	}

	@Test
	@DisplayName("Record 1167: LastName is Gathers")
	void LastNameOfRecord1167() {
		assertEquals("Gathers", customers.get(1166).getLastName());
	}

	@Test
	@DisplayName("Record 1167: Company is Mcnew Culligan Water Center")
	void CompanyOfRecord1167() {
		assertEquals("Mcnew Culligan Water Center", customers.get(1166).getCompany());
	}

	@Test
	@DisplayName("Record 1167: Address is 8043 Van Nuys Blvd")
	void AddressOfRecord1167() {
		assertEquals("8043 Van Nuys Blvd", customers.get(1166).getAddress());
	}

	@Test
	@DisplayName("Record 1167: City is Panorama City")
	void CityOfRecord1167() {
		assertEquals("Panorama City", customers.get(1166).getCity());
	}

	@Test
	@DisplayName("Record 1167: County is Los Angeles")
	void CountyOfRecord1167() {
		assertEquals("Los Angeles", customers.get(1166).getCounty());
	}

	@Test
	@DisplayName("Record 1167: State is CA")
	void StateOfRecord1167() {
		assertEquals("CA", customers.get(1166).getState());
	}

	@Test
	@DisplayName("Record 1167: ZIP is 91402")
	void ZIPOfRecord1167() {
		assertEquals("91402", customers.get(1166).getZIP());
	}

	@Test
	@DisplayName("Record 1167: Phone is 818-780-7768")
	void PhoneOfRecord1167() {
		assertEquals("818-780-7768", customers.get(1166).getPhone());
	}

	@Test
	@DisplayName("Record 1167: Fax is 818-780-4824")
	void FaxOfRecord1167() {
		assertEquals("818-780-4824", customers.get(1166).getFax());
	}

	@Test
	@DisplayName("Record 1167: Email is kysha@gathers.com")
	void EmailOfRecord1167() {
		assertEquals("kysha@gathers.com", customers.get(1166).getEmail());
	}

	@Test
	@DisplayName("Record 1167: Web is http://www.kyshagathers.com")
	void WebOfRecord1167() {
		assertEquals("http://www.kyshagathers.com", customers.get(1166).getWeb());
	}
}
