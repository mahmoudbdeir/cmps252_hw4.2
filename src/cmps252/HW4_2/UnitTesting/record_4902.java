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
class Record_4902 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4902: FirstName is Teresita")
	void FirstNameOfRecord4902() {
		assertEquals("Teresita", customers.get(4901).getFirstName());
	}

	@Test
	@DisplayName("Record 4902: LastName is Beckey")
	void LastNameOfRecord4902() {
		assertEquals("Beckey", customers.get(4901).getLastName());
	}

	@Test
	@DisplayName("Record 4902: Company is Pioneer Auto Museum")
	void CompanyOfRecord4902() {
		assertEquals("Pioneer Auto Museum", customers.get(4901).getCompany());
	}

	@Test
	@DisplayName("Record 4902: Address is 7494 Circle Dr")
	void AddressOfRecord4902() {
		assertEquals("7494 Circle Dr", customers.get(4901).getAddress());
	}

	@Test
	@DisplayName("Record 4902: City is Lannon")
	void CityOfRecord4902() {
		assertEquals("Lannon", customers.get(4901).getCity());
	}

	@Test
	@DisplayName("Record 4902: County is Waukesha")
	void CountyOfRecord4902() {
		assertEquals("Waukesha", customers.get(4901).getCounty());
	}

	@Test
	@DisplayName("Record 4902: State is WI")
	void StateOfRecord4902() {
		assertEquals("WI", customers.get(4901).getState());
	}

	@Test
	@DisplayName("Record 4902: ZIP is 53046")
	void ZIPOfRecord4902() {
		assertEquals("53046", customers.get(4901).getZIP());
	}

	@Test
	@DisplayName("Record 4902: Phone is 262-251-2669")
	void PhoneOfRecord4902() {
		assertEquals("262-251-2669", customers.get(4901).getPhone());
	}

	@Test
	@DisplayName("Record 4902: Fax is 262-251-8148")
	void FaxOfRecord4902() {
		assertEquals("262-251-8148", customers.get(4901).getFax());
	}

	@Test
	@DisplayName("Record 4902: Email is teresita@beckey.com")
	void EmailOfRecord4902() {
		assertEquals("teresita@beckey.com", customers.get(4901).getEmail());
	}

	@Test
	@DisplayName("Record 4902: Web is http://www.teresitabeckey.com")
	void WebOfRecord4902() {
		assertEquals("http://www.teresitabeckey.com", customers.get(4901).getWeb());
	}
}
