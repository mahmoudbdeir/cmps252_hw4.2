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
class Record_4535 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4535: FirstName is Jamison")
	void FirstNameOfRecord4535() {
		assertEquals("Jamison", customers.get(4534).getFirstName());
	}

	@Test
	@DisplayName("Record 4535: LastName is Scot")
	void LastNameOfRecord4535() {
		assertEquals("Scot", customers.get(4534).getLastName());
	}

	@Test
	@DisplayName("Record 4535: Company is Decorah Stationers")
	void CompanyOfRecord4535() {
		assertEquals("Decorah Stationers", customers.get(4534).getCompany());
	}

	@Test
	@DisplayName("Record 4535: Address is 10006 Crazy Horse Dr")
	void AddressOfRecord4535() {
		assertEquals("10006 Crazy Horse Dr", customers.get(4534).getAddress());
	}

	@Test
	@DisplayName("Record 4535: City is Juneau")
	void CityOfRecord4535() {
		assertEquals("Juneau", customers.get(4534).getCity());
	}

	@Test
	@DisplayName("Record 4535: County is Juneau")
	void CountyOfRecord4535() {
		assertEquals("Juneau", customers.get(4534).getCounty());
	}

	@Test
	@DisplayName("Record 4535: State is AK")
	void StateOfRecord4535() {
		assertEquals("AK", customers.get(4534).getState());
	}

	@Test
	@DisplayName("Record 4535: ZIP is 99801")
	void ZIPOfRecord4535() {
		assertEquals("99801", customers.get(4534).getZIP());
	}

	@Test
	@DisplayName("Record 4535: Phone is 907-789-0330")
	void PhoneOfRecord4535() {
		assertEquals("907-789-0330", customers.get(4534).getPhone());
	}

	@Test
	@DisplayName("Record 4535: Fax is 907-789-5035")
	void FaxOfRecord4535() {
		assertEquals("907-789-5035", customers.get(4534).getFax());
	}

	@Test
	@DisplayName("Record 4535: Email is jamison@scot.com")
	void EmailOfRecord4535() {
		assertEquals("jamison@scot.com", customers.get(4534).getEmail());
	}

	@Test
	@DisplayName("Record 4535: Web is http://www.jamisonscot.com")
	void WebOfRecord4535() {
		assertEquals("http://www.jamisonscot.com", customers.get(4534).getWeb());
	}
}
