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

@Tag("33")
class Record_597 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 597: FirstName is Viola")
	void FirstNameOfRecord597() {
		assertEquals("Viola", customers.get(596).getFirstName());
	}

	@Test
	@DisplayName("Record 597: LastName is Stocks")
	void LastNameOfRecord597() {
		assertEquals("Stocks", customers.get(596).getLastName());
	}

	@Test
	@DisplayName("Record 597: Company is Gelenitis, James G Esq")
	void CompanyOfRecord597() {
		assertEquals("Gelenitis, James G Esq", customers.get(596).getCompany());
	}

	@Test
	@DisplayName("Record 597: Address is 1460 3rd Ave")
	void AddressOfRecord597() {
		assertEquals("1460 3rd Ave", customers.get(596).getAddress());
	}

	@Test
	@DisplayName("Record 597: City is New York")
	void CityOfRecord597() {
		assertEquals("New York", customers.get(596).getCity());
	}

	@Test
	@DisplayName("Record 597: County is New York")
	void CountyOfRecord597() {
		assertEquals("New York", customers.get(596).getCounty());
	}

	@Test
	@DisplayName("Record 597: State is NY")
	void StateOfRecord597() {
		assertEquals("NY", customers.get(596).getState());
	}

	@Test
	@DisplayName("Record 597: ZIP is 10028")
	void ZIPOfRecord597() {
		assertEquals("10028", customers.get(596).getZIP());
	}

	@Test
	@DisplayName("Record 597: Phone is 212-628-7943")
	void PhoneOfRecord597() {
		assertEquals("212-628-7943", customers.get(596).getPhone());
	}

	@Test
	@DisplayName("Record 597: Fax is 212-628-8594")
	void FaxOfRecord597() {
		assertEquals("212-628-8594", customers.get(596).getFax());
	}

	@Test
	@DisplayName("Record 597: Email is viola@stocks.com")
	void EmailOfRecord597() {
		assertEquals("viola@stocks.com", customers.get(596).getEmail());
	}

	@Test
	@DisplayName("Record 597: Web is http://www.violastocks.com")
	void WebOfRecord597() {
		assertEquals("http://www.violastocks.com", customers.get(596).getWeb());
	}
}
