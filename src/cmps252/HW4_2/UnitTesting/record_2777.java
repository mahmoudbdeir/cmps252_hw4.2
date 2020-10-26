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

@Tag("24")
class Record_2777 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2777: FirstName is Kristi")
	void FirstNameOfRecord2777() {
		assertEquals("Kristi", customers.get(2776).getFirstName());
	}

	@Test
	@DisplayName("Record 2777: LastName is Kellstrom")
	void LastNameOfRecord2777() {
		assertEquals("Kellstrom", customers.get(2776).getLastName());
	}

	@Test
	@DisplayName("Record 2777: Company is Budget International Trvl Agcy")
	void CompanyOfRecord2777() {
		assertEquals("Budget International Trvl Agcy", customers.get(2776).getCompany());
	}

	@Test
	@DisplayName("Record 2777: Address is 500 Washington Rd")
	void AddressOfRecord2777() {
		assertEquals("500 Washington Rd", customers.get(2776).getAddress());
	}

	@Test
	@DisplayName("Record 2777: City is Newton")
	void CityOfRecord2777() {
		assertEquals("Newton", customers.get(2776).getCity());
	}

	@Test
	@DisplayName("Record 2777: County is Harvey")
	void CountyOfRecord2777() {
		assertEquals("Harvey", customers.get(2776).getCounty());
	}

	@Test
	@DisplayName("Record 2777: State is KS")
	void StateOfRecord2777() {
		assertEquals("KS", customers.get(2776).getState());
	}

	@Test
	@DisplayName("Record 2777: ZIP is 67114")
	void ZIPOfRecord2777() {
		assertEquals("67114", customers.get(2776).getZIP());
	}

	@Test
	@DisplayName("Record 2777: Phone is 316-262-3453")
	void PhoneOfRecord2777() {
		assertEquals("316-262-3453", customers.get(2776).getPhone());
	}

	@Test
	@DisplayName("Record 2777: Fax is 316-262-8103")
	void FaxOfRecord2777() {
		assertEquals("316-262-8103", customers.get(2776).getFax());
	}

	@Test
	@DisplayName("Record 2777: Email is kristi@kellstrom.com")
	void EmailOfRecord2777() {
		assertEquals("kristi@kellstrom.com", customers.get(2776).getEmail());
	}

	@Test
	@DisplayName("Record 2777: Web is http://www.kristikellstrom.com")
	void WebOfRecord2777() {
		assertEquals("http://www.kristikellstrom.com", customers.get(2776).getWeb());
	}
}
