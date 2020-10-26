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

@Tag("45")
class Record_2951 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2951: FirstName is Judson")
	void FirstNameOfRecord2951() {
		assertEquals("Judson", customers.get(2950).getFirstName());
	}

	@Test
	@DisplayName("Record 2951: LastName is Elizando")
	void LastNameOfRecord2951() {
		assertEquals("Elizando", customers.get(2950).getLastName());
	}

	@Test
	@DisplayName("Record 2951: Company is Baltimore City Life Museums")
	void CompanyOfRecord2951() {
		assertEquals("Baltimore City Life Museums", customers.get(2950).getCompany());
	}

	@Test
	@DisplayName("Record 2951: Address is 3120 N 27th Ave")
	void AddressOfRecord2951() {
		assertEquals("3120 N 27th Ave", customers.get(2950).getAddress());
	}

	@Test
	@DisplayName("Record 2951: City is Phoenix")
	void CityOfRecord2951() {
		assertEquals("Phoenix", customers.get(2950).getCity());
	}

	@Test
	@DisplayName("Record 2951: County is Maricopa")
	void CountyOfRecord2951() {
		assertEquals("Maricopa", customers.get(2950).getCounty());
	}

	@Test
	@DisplayName("Record 2951: State is AZ")
	void StateOfRecord2951() {
		assertEquals("AZ", customers.get(2950).getState());
	}

	@Test
	@DisplayName("Record 2951: ZIP is 85017")
	void ZIPOfRecord2951() {
		assertEquals("85017", customers.get(2950).getZIP());
	}

	@Test
	@DisplayName("Record 2951: Phone is 602-252-4139")
	void PhoneOfRecord2951() {
		assertEquals("602-252-4139", customers.get(2950).getPhone());
	}

	@Test
	@DisplayName("Record 2951: Fax is 602-252-5559")
	void FaxOfRecord2951() {
		assertEquals("602-252-5559", customers.get(2950).getFax());
	}

	@Test
	@DisplayName("Record 2951: Email is judson@elizando.com")
	void EmailOfRecord2951() {
		assertEquals("judson@elizando.com", customers.get(2950).getEmail());
	}

	@Test
	@DisplayName("Record 2951: Web is http://www.judsonelizando.com")
	void WebOfRecord2951() {
		assertEquals("http://www.judsonelizando.com", customers.get(2950).getWeb());
	}
}
