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
class Record_2102 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2102: FirstName is Kimberly")
	void FirstNameOfRecord2102() {
		assertEquals("Kimberly", customers.get(2101).getFirstName());
	}

	@Test
	@DisplayName("Record 2102: LastName is Sugahara")
	void LastNameOfRecord2102() {
		assertEquals("Sugahara", customers.get(2101).getLastName());
	}

	@Test
	@DisplayName("Record 2102: Company is Precision Heat Trtmnt Co Inc")
	void CompanyOfRecord2102() {
		assertEquals("Precision Heat Trtmnt Co Inc", customers.get(2101).getCompany());
	}

	@Test
	@DisplayName("Record 2102: Address is 124 S Belair Rd")
	void AddressOfRecord2102() {
		assertEquals("124 S Belair Rd", customers.get(2101).getAddress());
	}

	@Test
	@DisplayName("Record 2102: City is Augusta")
	void CityOfRecord2102() {
		assertEquals("Augusta", customers.get(2101).getCity());
	}

	@Test
	@DisplayName("Record 2102: County is Columbia")
	void CountyOfRecord2102() {
		assertEquals("Columbia", customers.get(2101).getCounty());
	}

	@Test
	@DisplayName("Record 2102: State is GA")
	void StateOfRecord2102() {
		assertEquals("GA", customers.get(2101).getState());
	}

	@Test
	@DisplayName("Record 2102: ZIP is 30907")
	void ZIPOfRecord2102() {
		assertEquals("30907", customers.get(2101).getZIP());
	}

	@Test
	@DisplayName("Record 2102: Phone is 706-860-5561")
	void PhoneOfRecord2102() {
		assertEquals("706-860-5561", customers.get(2101).getPhone());
	}

	@Test
	@DisplayName("Record 2102: Fax is 706-860-1769")
	void FaxOfRecord2102() {
		assertEquals("706-860-1769", customers.get(2101).getFax());
	}

	@Test
	@DisplayName("Record 2102: Email is kimberly@sugahara.com")
	void EmailOfRecord2102() {
		assertEquals("kimberly@sugahara.com", customers.get(2101).getEmail());
	}

	@Test
	@DisplayName("Record 2102: Web is http://www.kimberlysugahara.com")
	void WebOfRecord2102() {
		assertEquals("http://www.kimberlysugahara.com", customers.get(2101).getWeb());
	}
}
