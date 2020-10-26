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
class Record_4957 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4957: FirstName is Harriet")
	void FirstNameOfRecord4957() {
		assertEquals("Harriet", customers.get(4956).getFirstName());
	}

	@Test
	@DisplayName("Record 4957: LastName is Cibik")
	void LastNameOfRecord4957() {
		assertEquals("Cibik", customers.get(4956).getLastName());
	}

	@Test
	@DisplayName("Record 4957: Company is Soverygn Motor Cars Ltd")
	void CompanyOfRecord4957() {
		assertEquals("Soverygn Motor Cars Ltd", customers.get(4956).getCompany());
	}

	@Test
	@DisplayName("Record 4957: Address is 35 Glenlake Pky Ne")
	void AddressOfRecord4957() {
		assertEquals("35 Glenlake Pky Ne", customers.get(4956).getAddress());
	}

	@Test
	@DisplayName("Record 4957: City is Atlanta")
	void CityOfRecord4957() {
		assertEquals("Atlanta", customers.get(4956).getCity());
	}

	@Test
	@DisplayName("Record 4957: County is Fulton")
	void CountyOfRecord4957() {
		assertEquals("Fulton", customers.get(4956).getCounty());
	}

	@Test
	@DisplayName("Record 4957: State is GA")
	void StateOfRecord4957() {
		assertEquals("GA", customers.get(4956).getState());
	}

	@Test
	@DisplayName("Record 4957: ZIP is 30328")
	void ZIPOfRecord4957() {
		assertEquals("30328", customers.get(4956).getZIP());
	}

	@Test
	@DisplayName("Record 4957: Phone is 770-671-7597")
	void PhoneOfRecord4957() {
		assertEquals("770-671-7597", customers.get(4956).getPhone());
	}

	@Test
	@DisplayName("Record 4957: Fax is 770-671-7501")
	void FaxOfRecord4957() {
		assertEquals("770-671-7501", customers.get(4956).getFax());
	}

	@Test
	@DisplayName("Record 4957: Email is harriet@cibik.com")
	void EmailOfRecord4957() {
		assertEquals("harriet@cibik.com", customers.get(4956).getEmail());
	}

	@Test
	@DisplayName("Record 4957: Web is http://www.harrietcibik.com")
	void WebOfRecord4957() {
		assertEquals("http://www.harrietcibik.com", customers.get(4956).getWeb());
	}
}
