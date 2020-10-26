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

@Tag("44")
class Record_3388 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3388: FirstName is Herman")
	void FirstNameOfRecord3388() {
		assertEquals("Herman", customers.get(3387).getFirstName());
	}

	@Test
	@DisplayName("Record 3388: LastName is Ruckle")
	void LastNameOfRecord3388() {
		assertEquals("Ruckle", customers.get(3387).getLastName());
	}

	@Test
	@DisplayName("Record 3388: Company is Builderway Of Memphis")
	void CompanyOfRecord3388() {
		assertEquals("Builderway Of Memphis", customers.get(3387).getCompany());
	}

	@Test
	@DisplayName("Record 3388: Address is 7448 Auburn Blvd")
	void AddressOfRecord3388() {
		assertEquals("7448 Auburn Blvd", customers.get(3387).getAddress());
	}

	@Test
	@DisplayName("Record 3388: City is Citrus Hyghts")
	void CityOfRecord3388() {
		assertEquals("Citrus Hyghts", customers.get(3387).getCity());
	}

	@Test
	@DisplayName("Record 3388: County is Sacramento")
	void CountyOfRecord3388() {
		assertEquals("Sacramento", customers.get(3387).getCounty());
	}

	@Test
	@DisplayName("Record 3388: State is CA")
	void StateOfRecord3388() {
		assertEquals("CA", customers.get(3387).getState());
	}

	@Test
	@DisplayName("Record 3388: ZIP is 95610")
	void ZIPOfRecord3388() {
		assertEquals("95610", customers.get(3387).getZIP());
	}

	@Test
	@DisplayName("Record 3388: Phone is 916-723-2533")
	void PhoneOfRecord3388() {
		assertEquals("916-723-2533", customers.get(3387).getPhone());
	}

	@Test
	@DisplayName("Record 3388: Fax is 916-723-0853")
	void FaxOfRecord3388() {
		assertEquals("916-723-0853", customers.get(3387).getFax());
	}

	@Test
	@DisplayName("Record 3388: Email is herman@ruckle.com")
	void EmailOfRecord3388() {
		assertEquals("herman@ruckle.com", customers.get(3387).getEmail());
	}

	@Test
	@DisplayName("Record 3388: Web is http://www.hermanruckle.com")
	void WebOfRecord3388() {
		assertEquals("http://www.hermanruckle.com", customers.get(3387).getWeb());
	}
}
