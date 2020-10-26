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

@Tag("32")
class Record_4104 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4104: FirstName is Dee")
	void FirstNameOfRecord4104() {
		assertEquals("Dee", customers.get(4103).getFirstName());
	}

	@Test
	@DisplayName("Record 4104: LastName is Kilcullen")
	void LastNameOfRecord4104() {
		assertEquals("Kilcullen", customers.get(4103).getLastName());
	}

	@Test
	@DisplayName("Record 4104: Company is United Ind Txtl Prod Inc")
	void CompanyOfRecord4104() {
		assertEquals("United Ind Txtl Prod Inc", customers.get(4103).getCompany());
	}

	@Test
	@DisplayName("Record 4104: Address is 21411 N 14th Ave")
	void AddressOfRecord4104() {
		assertEquals("21411 N 14th Ave", customers.get(4103).getAddress());
	}

	@Test
	@DisplayName("Record 4104: City is Phoenix")
	void CityOfRecord4104() {
		assertEquals("Phoenix", customers.get(4103).getCity());
	}

	@Test
	@DisplayName("Record 4104: County is Maricopa")
	void CountyOfRecord4104() {
		assertEquals("Maricopa", customers.get(4103).getCounty());
	}

	@Test
	@DisplayName("Record 4104: State is AZ")
	void StateOfRecord4104() {
		assertEquals("AZ", customers.get(4103).getState());
	}

	@Test
	@DisplayName("Record 4104: ZIP is 85027")
	void ZIPOfRecord4104() {
		assertEquals("85027", customers.get(4103).getZIP());
	}

	@Test
	@DisplayName("Record 4104: Phone is 623-780-0626")
	void PhoneOfRecord4104() {
		assertEquals("623-780-0626", customers.get(4103).getPhone());
	}

	@Test
	@DisplayName("Record 4104: Fax is 623-780-6244")
	void FaxOfRecord4104() {
		assertEquals("623-780-6244", customers.get(4103).getFax());
	}

	@Test
	@DisplayName("Record 4104: Email is dee@kilcullen.com")
	void EmailOfRecord4104() {
		assertEquals("dee@kilcullen.com", customers.get(4103).getEmail());
	}

	@Test
	@DisplayName("Record 4104: Web is http://www.deekilcullen.com")
	void WebOfRecord4104() {
		assertEquals("http://www.deekilcullen.com", customers.get(4103).getWeb());
	}
}
