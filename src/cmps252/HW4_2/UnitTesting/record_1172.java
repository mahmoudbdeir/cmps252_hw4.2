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
class Record_1172 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1172: FirstName is Denice")
	void FirstNameOfRecord1172() {
		assertEquals("Denice", customers.get(1171).getFirstName());
	}

	@Test
	@DisplayName("Record 1172: LastName is Burri")
	void LastNameOfRecord1172() {
		assertEquals("Burri", customers.get(1171).getLastName());
	}

	@Test
	@DisplayName("Record 1172: Company is Parkway Business Machines Inc")
	void CompanyOfRecord1172() {
		assertEquals("Parkway Business Machines Inc", customers.get(1171).getCompany());
	}

	@Test
	@DisplayName("Record 1172: Address is 8975 Yellow Brick Rd  #-a")
	void AddressOfRecord1172() {
		assertEquals("8975 Yellow Brick Rd  #-a", customers.get(1171).getAddress());
	}

	@Test
	@DisplayName("Record 1172: City is Rosedale")
	void CityOfRecord1172() {
		assertEquals("Rosedale", customers.get(1171).getCity());
	}

	@Test
	@DisplayName("Record 1172: County is Baltimore")
	void CountyOfRecord1172() {
		assertEquals("Baltimore", customers.get(1171).getCounty());
	}

	@Test
	@DisplayName("Record 1172: State is MD")
	void StateOfRecord1172() {
		assertEquals("MD", customers.get(1171).getState());
	}

	@Test
	@DisplayName("Record 1172: ZIP is 21237")
	void ZIPOfRecord1172() {
		assertEquals("21237", customers.get(1171).getZIP());
	}

	@Test
	@DisplayName("Record 1172: Phone is 410-574-6387")
	void PhoneOfRecord1172() {
		assertEquals("410-574-6387", customers.get(1171).getPhone());
	}

	@Test
	@DisplayName("Record 1172: Fax is 410-574-5385")
	void FaxOfRecord1172() {
		assertEquals("410-574-5385", customers.get(1171).getFax());
	}

	@Test
	@DisplayName("Record 1172: Email is denice@burri.com")
	void EmailOfRecord1172() {
		assertEquals("denice@burri.com", customers.get(1171).getEmail());
	}

	@Test
	@DisplayName("Record 1172: Web is http://www.deniceburri.com")
	void WebOfRecord1172() {
		assertEquals("http://www.deniceburri.com", customers.get(1171).getWeb());
	}
}
