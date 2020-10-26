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

@Tag("16")
class Record_1138 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1138: FirstName is Sterling")
	void FirstNameOfRecord1138() {
		assertEquals("Sterling", customers.get(1137).getFirstName());
	}

	@Test
	@DisplayName("Record 1138: LastName is Kalaf")
	void LastNameOfRecord1138() {
		assertEquals("Kalaf", customers.get(1137).getLastName());
	}

	@Test
	@DisplayName("Record 1138: Company is Chips Pro Rehab")
	void CompanyOfRecord1138() {
		assertEquals("Chips Pro Rehab", customers.get(1137).getCompany());
	}

	@Test
	@DisplayName("Record 1138: Address is 8808 Monard Dr")
	void AddressOfRecord1138() {
		assertEquals("8808 Monard Dr", customers.get(1137).getAddress());
	}

	@Test
	@DisplayName("Record 1138: City is Silver Spring")
	void CityOfRecord1138() {
		assertEquals("Silver Spring", customers.get(1137).getCity());
	}

	@Test
	@DisplayName("Record 1138: County is Montgomery")
	void CountyOfRecord1138() {
		assertEquals("Montgomery", customers.get(1137).getCounty());
	}

	@Test
	@DisplayName("Record 1138: State is MD")
	void StateOfRecord1138() {
		assertEquals("MD", customers.get(1137).getState());
	}

	@Test
	@DisplayName("Record 1138: ZIP is 20910")
	void ZIPOfRecord1138() {
		assertEquals("20910", customers.get(1137).getZIP());
	}

	@Test
	@DisplayName("Record 1138: Phone is 301-585-6997")
	void PhoneOfRecord1138() {
		assertEquals("301-585-6997", customers.get(1137).getPhone());
	}

	@Test
	@DisplayName("Record 1138: Fax is 301-585-1168")
	void FaxOfRecord1138() {
		assertEquals("301-585-1168", customers.get(1137).getFax());
	}

	@Test
	@DisplayName("Record 1138: Email is sterling@kalaf.com")
	void EmailOfRecord1138() {
		assertEquals("sterling@kalaf.com", customers.get(1137).getEmail());
	}

	@Test
	@DisplayName("Record 1138: Web is http://www.sterlingkalaf.com")
	void WebOfRecord1138() {
		assertEquals("http://www.sterlingkalaf.com", customers.get(1137).getWeb());
	}
}
