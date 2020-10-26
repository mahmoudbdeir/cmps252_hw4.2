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

@Tag("40")
class Record_2841 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2841: FirstName is Preston")
	void FirstNameOfRecord2841() {
		assertEquals("Preston", customers.get(2840).getFirstName());
	}

	@Test
	@DisplayName("Record 2841: LastName is Knouse")
	void LastNameOfRecord2841() {
		assertEquals("Knouse", customers.get(2840).getLastName());
	}

	@Test
	@DisplayName("Record 2841: Company is Wolfe & Associates Inc")
	void CompanyOfRecord2841() {
		assertEquals("Wolfe & Associates Inc", customers.get(2840).getCompany());
	}

	@Test
	@DisplayName("Record 2841: Address is 111 Delaware Ave")
	void AddressOfRecord2841() {
		assertEquals("111 Delaware Ave", customers.get(2840).getAddress());
	}

	@Test
	@DisplayName("Record 2841: City is Glen Burnie")
	void CityOfRecord2841() {
		assertEquals("Glen Burnie", customers.get(2840).getCity());
	}

	@Test
	@DisplayName("Record 2841: County is Anne Arundel")
	void CountyOfRecord2841() {
		assertEquals("Anne Arundel", customers.get(2840).getCounty());
	}

	@Test
	@DisplayName("Record 2841: State is MD")
	void StateOfRecord2841() {
		assertEquals("MD", customers.get(2840).getState());
	}

	@Test
	@DisplayName("Record 2841: ZIP is 21061")
	void ZIPOfRecord2841() {
		assertEquals("21061", customers.get(2840).getZIP());
	}

	@Test
	@DisplayName("Record 2841: Phone is 410-766-9012")
	void PhoneOfRecord2841() {
		assertEquals("410-766-9012", customers.get(2840).getPhone());
	}

	@Test
	@DisplayName("Record 2841: Fax is 410-766-4507")
	void FaxOfRecord2841() {
		assertEquals("410-766-4507", customers.get(2840).getFax());
	}

	@Test
	@DisplayName("Record 2841: Email is preston@knouse.com")
	void EmailOfRecord2841() {
		assertEquals("preston@knouse.com", customers.get(2840).getEmail());
	}

	@Test
	@DisplayName("Record 2841: Web is http://www.prestonknouse.com")
	void WebOfRecord2841() {
		assertEquals("http://www.prestonknouse.com", customers.get(2840).getWeb());
	}
}
