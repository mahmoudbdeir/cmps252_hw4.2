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

@Tag("7")
class Record_365 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 365: FirstName is Harry")
	void FirstNameOfRecord365() {
		assertEquals("Harry", customers.get(364).getFirstName());
	}

	@Test
	@DisplayName("Record 365: LastName is Vendrick")
	void LastNameOfRecord365() {
		assertEquals("Vendrick", customers.get(364).getLastName());
	}

	@Test
	@DisplayName("Record 365: Company is Hermans Taxidermy")
	void CompanyOfRecord365() {
		assertEquals("Hermans Taxidermy", customers.get(364).getCompany());
	}

	@Test
	@DisplayName("Record 365: Address is 922 W Veterans Memorial Blvd")
	void AddressOfRecord365() {
		assertEquals("922 W Veterans Memorial Blvd", customers.get(364).getAddress());
	}

	@Test
	@DisplayName("Record 365: City is Killeen")
	void CityOfRecord365() {
		assertEquals("Killeen", customers.get(364).getCity());
	}

	@Test
	@DisplayName("Record 365: County is Bell")
	void CountyOfRecord365() {
		assertEquals("Bell", customers.get(364).getCounty());
	}

	@Test
	@DisplayName("Record 365: State is TX")
	void StateOfRecord365() {
		assertEquals("TX", customers.get(364).getState());
	}

	@Test
	@DisplayName("Record 365: ZIP is 76541")
	void ZIPOfRecord365() {
		assertEquals("76541", customers.get(364).getZIP());
	}

	@Test
	@DisplayName("Record 365: Phone is 254-634-3057")
	void PhoneOfRecord365() {
		assertEquals("254-634-3057", customers.get(364).getPhone());
	}

	@Test
	@DisplayName("Record 365: Fax is 254-634-1221")
	void FaxOfRecord365() {
		assertEquals("254-634-1221", customers.get(364).getFax());
	}

	@Test
	@DisplayName("Record 365: Email is harry@vendrick.com")
	void EmailOfRecord365() {
		assertEquals("harry@vendrick.com", customers.get(364).getEmail());
	}

	@Test
	@DisplayName("Record 365: Web is http://www.harryvendrick.com")
	void WebOfRecord365() {
		assertEquals("http://www.harryvendrick.com", customers.get(364).getWeb());
	}
}
