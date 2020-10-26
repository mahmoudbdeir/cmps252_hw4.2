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

@Tag("22")
class Record_396 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 396: FirstName is Houston")
	void FirstNameOfRecord396() {
		assertEquals("Houston", customers.get(395).getFirstName());
	}

	@Test
	@DisplayName("Record 396: LastName is Caspi")
	void LastNameOfRecord396() {
		assertEquals("Caspi", customers.get(395).getLastName());
	}

	@Test
	@DisplayName("Record 396: Company is Allen Bradley Co")
	void CompanyOfRecord396() {
		assertEquals("Allen Bradley Co", customers.get(395).getCompany());
	}

	@Test
	@DisplayName("Record 396: Address is 1605 Country Club Rd")
	void AddressOfRecord396() {
		assertEquals("1605 Country Club Rd", customers.get(395).getAddress());
	}

	@Test
	@DisplayName("Record 396: City is Indianapolis")
	void CityOfRecord396() {
		assertEquals("Indianapolis", customers.get(395).getCity());
	}

	@Test
	@DisplayName("Record 396: County is Marion")
	void CountyOfRecord396() {
		assertEquals("Marion", customers.get(395).getCounty());
	}

	@Test
	@DisplayName("Record 396: State is IN")
	void StateOfRecord396() {
		assertEquals("IN", customers.get(395).getState());
	}

	@Test
	@DisplayName("Record 396: ZIP is 46234")
	void ZIPOfRecord396() {
		assertEquals("46234", customers.get(395).getZIP());
	}

	@Test
	@DisplayName("Record 396: Phone is 317-271-2727")
	void PhoneOfRecord396() {
		assertEquals("317-271-2727", customers.get(395).getPhone());
	}

	@Test
	@DisplayName("Record 396: Fax is 317-271-6113")
	void FaxOfRecord396() {
		assertEquals("317-271-6113", customers.get(395).getFax());
	}

	@Test
	@DisplayName("Record 396: Email is houston@caspi.com")
	void EmailOfRecord396() {
		assertEquals("houston@caspi.com", customers.get(395).getEmail());
	}

	@Test
	@DisplayName("Record 396: Web is http://www.houstoncaspi.com")
	void WebOfRecord396() {
		assertEquals("http://www.houstoncaspi.com", customers.get(395).getWeb());
	}
}
