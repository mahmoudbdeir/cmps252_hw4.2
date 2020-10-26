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
class Record_1897 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1897: FirstName is Homer")
	void FirstNameOfRecord1897() {
		assertEquals("Homer", customers.get(1896).getFirstName());
	}

	@Test
	@DisplayName("Record 1897: LastName is Germy")
	void LastNameOfRecord1897() {
		assertEquals("Germy", customers.get(1896).getLastName());
	}

	@Test
	@DisplayName("Record 1897: Company is Savoy Music Center")
	void CompanyOfRecord1897() {
		assertEquals("Savoy Music Center", customers.get(1896).getCompany());
	}

	@Test
	@DisplayName("Record 1897: Address is 5070 N 40th St  #-150")
	void AddressOfRecord1897() {
		assertEquals("5070 N 40th St  #-150", customers.get(1896).getAddress());
	}

	@Test
	@DisplayName("Record 1897: City is Phoenix")
	void CityOfRecord1897() {
		assertEquals("Phoenix", customers.get(1896).getCity());
	}

	@Test
	@DisplayName("Record 1897: County is Maricopa")
	void CountyOfRecord1897() {
		assertEquals("Maricopa", customers.get(1896).getCounty());
	}

	@Test
	@DisplayName("Record 1897: State is AZ")
	void StateOfRecord1897() {
		assertEquals("AZ", customers.get(1896).getState());
	}

	@Test
	@DisplayName("Record 1897: ZIP is 85018")
	void ZIPOfRecord1897() {
		assertEquals("85018", customers.get(1896).getZIP());
	}

	@Test
	@DisplayName("Record 1897: Phone is 602-957-0223")
	void PhoneOfRecord1897() {
		assertEquals("602-957-0223", customers.get(1896).getPhone());
	}

	@Test
	@DisplayName("Record 1897: Fax is 602-957-9528")
	void FaxOfRecord1897() {
		assertEquals("602-957-9528", customers.get(1896).getFax());
	}

	@Test
	@DisplayName("Record 1897: Email is homer@germy.com")
	void EmailOfRecord1897() {
		assertEquals("homer@germy.com", customers.get(1896).getEmail());
	}

	@Test
	@DisplayName("Record 1897: Web is http://www.homergermy.com")
	void WebOfRecord1897() {
		assertEquals("http://www.homergermy.com", customers.get(1896).getWeb());
	}
}
