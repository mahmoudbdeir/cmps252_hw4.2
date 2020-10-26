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
class Record_4989 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4989: FirstName is Benny")
	void FirstNameOfRecord4989() {
		assertEquals("Benny", customers.get(4988).getFirstName());
	}

	@Test
	@DisplayName("Record 4989: LastName is Jenkinson")
	void LastNameOfRecord4989() {
		assertEquals("Jenkinson", customers.get(4988).getLastName());
	}

	@Test
	@DisplayName("Record 4989: Company is Scott, Michael J Esq")
	void CompanyOfRecord4989() {
		assertEquals("Scott, Michael J Esq", customers.get(4988).getCompany());
	}

	@Test
	@DisplayName("Record 4989: Address is 440 Park Ave")
	void AddressOfRecord4989() {
		assertEquals("440 Park Ave", customers.get(4988).getAddress());
	}

	@Test
	@DisplayName("Record 4989: City is New York")
	void CityOfRecord4989() {
		assertEquals("New York", customers.get(4988).getCity());
	}

	@Test
	@DisplayName("Record 4989: County is New York")
	void CountyOfRecord4989() {
		assertEquals("New York", customers.get(4988).getCounty());
	}

	@Test
	@DisplayName("Record 4989: State is NY")
	void StateOfRecord4989() {
		assertEquals("NY", customers.get(4988).getState());
	}

	@Test
	@DisplayName("Record 4989: ZIP is 10022")
	void ZIPOfRecord4989() {
		assertEquals("10022", customers.get(4988).getZIP());
	}

	@Test
	@DisplayName("Record 4989: Phone is 212-684-1322")
	void PhoneOfRecord4989() {
		assertEquals("212-684-1322", customers.get(4988).getPhone());
	}

	@Test
	@DisplayName("Record 4989: Fax is 212-684-6807")
	void FaxOfRecord4989() {
		assertEquals("212-684-6807", customers.get(4988).getFax());
	}

	@Test
	@DisplayName("Record 4989: Email is benny@jenkinson.com")
	void EmailOfRecord4989() {
		assertEquals("benny@jenkinson.com", customers.get(4988).getEmail());
	}

	@Test
	@DisplayName("Record 4989: Web is http://www.bennyjenkinson.com")
	void WebOfRecord4989() {
		assertEquals("http://www.bennyjenkinson.com", customers.get(4988).getWeb());
	}
}
