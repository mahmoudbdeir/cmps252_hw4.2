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
class Record_2892 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2892: FirstName is Dorothea")
	void FirstNameOfRecord2892() {
		assertEquals("Dorothea", customers.get(2891).getFirstName());
	}

	@Test
	@DisplayName("Record 2892: LastName is Pritt")
	void LastNameOfRecord2892() {
		assertEquals("Pritt", customers.get(2891).getLastName());
	}

	@Test
	@DisplayName("Record 2892: Company is Gladden Excavating Inc")
	void CompanyOfRecord2892() {
		assertEquals("Gladden Excavating Inc", customers.get(2891).getCompany());
	}

	@Test
	@DisplayName("Record 2892: Address is 216 E Reynolds Rd  #-a")
	void AddressOfRecord2892() {
		assertEquals("216 E Reynolds Rd  #-a", customers.get(2891).getAddress());
	}

	@Test
	@DisplayName("Record 2892: City is Lexington")
	void CityOfRecord2892() {
		assertEquals("Lexington", customers.get(2891).getCity());
	}

	@Test
	@DisplayName("Record 2892: County is Fayette")
	void CountyOfRecord2892() {
		assertEquals("Fayette", customers.get(2891).getCounty());
	}

	@Test
	@DisplayName("Record 2892: State is KY")
	void StateOfRecord2892() {
		assertEquals("KY", customers.get(2891).getState());
	}

	@Test
	@DisplayName("Record 2892: ZIP is 40517")
	void ZIPOfRecord2892() {
		assertEquals("40517", customers.get(2891).getZIP());
	}

	@Test
	@DisplayName("Record 2892: Phone is 859-273-1502")
	void PhoneOfRecord2892() {
		assertEquals("859-273-1502", customers.get(2891).getPhone());
	}

	@Test
	@DisplayName("Record 2892: Fax is 859-273-2731")
	void FaxOfRecord2892() {
		assertEquals("859-273-2731", customers.get(2891).getFax());
	}

	@Test
	@DisplayName("Record 2892: Email is dorothea@pritt.com")
	void EmailOfRecord2892() {
		assertEquals("dorothea@pritt.com", customers.get(2891).getEmail());
	}

	@Test
	@DisplayName("Record 2892: Web is http://www.dorotheapritt.com")
	void WebOfRecord2892() {
		assertEquals("http://www.dorotheapritt.com", customers.get(2891).getWeb());
	}
}
