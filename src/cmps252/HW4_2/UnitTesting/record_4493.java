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

@Tag("2")
class Record_4493 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4493: FirstName is Isiah")
	void FirstNameOfRecord4493() {
		assertEquals("Isiah", customers.get(4492).getFirstName());
	}

	@Test
	@DisplayName("Record 4493: LastName is Shanna")
	void LastNameOfRecord4493() {
		assertEquals("Shanna", customers.get(4492).getLastName());
	}

	@Test
	@DisplayName("Record 4493: Company is Rose, Michael A Esq")
	void CompanyOfRecord4493() {
		assertEquals("Rose, Michael A Esq", customers.get(4492).getCompany());
	}

	@Test
	@DisplayName("Record 4493: Address is 8355 Rockville Rd")
	void AddressOfRecord4493() {
		assertEquals("8355 Rockville Rd", customers.get(4492).getAddress());
	}

	@Test
	@DisplayName("Record 4493: City is Indianapolis")
	void CityOfRecord4493() {
		assertEquals("Indianapolis", customers.get(4492).getCity());
	}

	@Test
	@DisplayName("Record 4493: County is Marion")
	void CountyOfRecord4493() {
		assertEquals("Marion", customers.get(4492).getCounty());
	}

	@Test
	@DisplayName("Record 4493: State is IN")
	void StateOfRecord4493() {
		assertEquals("IN", customers.get(4492).getState());
	}

	@Test
	@DisplayName("Record 4493: ZIP is 46234")
	void ZIPOfRecord4493() {
		assertEquals("46234", customers.get(4492).getZIP());
	}

	@Test
	@DisplayName("Record 4493: Phone is 317-271-2820")
	void PhoneOfRecord4493() {
		assertEquals("317-271-2820", customers.get(4492).getPhone());
	}

	@Test
	@DisplayName("Record 4493: Fax is 317-271-7606")
	void FaxOfRecord4493() {
		assertEquals("317-271-7606", customers.get(4492).getFax());
	}

	@Test
	@DisplayName("Record 4493: Email is isiah@shanna.com")
	void EmailOfRecord4493() {
		assertEquals("isiah@shanna.com", customers.get(4492).getEmail());
	}

	@Test
	@DisplayName("Record 4493: Web is http://www.isiahshanna.com")
	void WebOfRecord4493() {
		assertEquals("http://www.isiahshanna.com", customers.get(4492).getWeb());
	}
}
