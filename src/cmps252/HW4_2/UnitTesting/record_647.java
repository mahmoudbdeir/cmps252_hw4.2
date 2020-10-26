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

@Tag("39")
class Record_647 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 647: FirstName is Maureen")
	void FirstNameOfRecord647() {
		assertEquals("Maureen", customers.get(646).getFirstName());
	}

	@Test
	@DisplayName("Record 647: LastName is Lachat")
	void LastNameOfRecord647() {
		assertEquals("Lachat", customers.get(646).getLastName());
	}

	@Test
	@DisplayName("Record 647: Company is Ed Brandel Realty")
	void CompanyOfRecord647() {
		assertEquals("Ed Brandel Realty", customers.get(646).getCompany());
	}

	@Test
	@DisplayName("Record 647: Address is 225 Villa Dr")
	void AddressOfRecord647() {
		assertEquals("225 Villa Dr", customers.get(646).getAddress());
	}

	@Test
	@DisplayName("Record 647: City is Corpus Christi")
	void CityOfRecord647() {
		assertEquals("Corpus Christi", customers.get(646).getCity());
	}

	@Test
	@DisplayName("Record 647: County is Nueces")
	void CountyOfRecord647() {
		assertEquals("Nueces", customers.get(646).getCounty());
	}

	@Test
	@DisplayName("Record 647: State is TX")
	void StateOfRecord647() {
		assertEquals("TX", customers.get(646).getState());
	}

	@Test
	@DisplayName("Record 647: ZIP is 78408")
	void ZIPOfRecord647() {
		assertEquals("78408", customers.get(646).getZIP());
	}

	@Test
	@DisplayName("Record 647: Phone is 361-883-1646")
	void PhoneOfRecord647() {
		assertEquals("361-883-1646", customers.get(646).getPhone());
	}

	@Test
	@DisplayName("Record 647: Fax is 361-883-4701")
	void FaxOfRecord647() {
		assertEquals("361-883-4701", customers.get(646).getFax());
	}

	@Test
	@DisplayName("Record 647: Email is maureen@lachat.com")
	void EmailOfRecord647() {
		assertEquals("maureen@lachat.com", customers.get(646).getEmail());
	}

	@Test
	@DisplayName("Record 647: Web is http://www.maureenlachat.com")
	void WebOfRecord647() {
		assertEquals("http://www.maureenlachat.com", customers.get(646).getWeb());
	}
}
