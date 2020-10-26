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

@Tag("5")
class Record_4572 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4572: FirstName is Bessie")
	void FirstNameOfRecord4572() {
		assertEquals("Bessie", customers.get(4571).getFirstName());
	}

	@Test
	@DisplayName("Record 4572: LastName is Yragui")
	void LastNameOfRecord4572() {
		assertEquals("Yragui", customers.get(4571).getLastName());
	}

	@Test
	@DisplayName("Record 4572: Company is Rosenfeld, Edward M Esq")
	void CompanyOfRecord4572() {
		assertEquals("Rosenfeld, Edward M Esq", customers.get(4571).getCompany());
	}

	@Test
	@DisplayName("Record 4572: Address is 17 Academy St")
	void AddressOfRecord4572() {
		assertEquals("17 Academy St", customers.get(4571).getAddress());
	}

	@Test
	@DisplayName("Record 4572: City is Newark")
	void CityOfRecord4572() {
		assertEquals("Newark", customers.get(4571).getCity());
	}

	@Test
	@DisplayName("Record 4572: County is Essex")
	void CountyOfRecord4572() {
		assertEquals("Essex", customers.get(4571).getCounty());
	}

	@Test
	@DisplayName("Record 4572: State is NJ")
	void StateOfRecord4572() {
		assertEquals("NJ", customers.get(4571).getState());
	}

	@Test
	@DisplayName("Record 4572: ZIP is 7102")
	void ZIPOfRecord4572() {
		assertEquals("7102", customers.get(4571).getZIP());
	}

	@Test
	@DisplayName("Record 4572: Phone is 973-622-5728")
	void PhoneOfRecord4572() {
		assertEquals("973-622-5728", customers.get(4571).getPhone());
	}

	@Test
	@DisplayName("Record 4572: Fax is 973-622-7049")
	void FaxOfRecord4572() {
		assertEquals("973-622-7049", customers.get(4571).getFax());
	}

	@Test
	@DisplayName("Record 4572: Email is bessie@yragui.com")
	void EmailOfRecord4572() {
		assertEquals("bessie@yragui.com", customers.get(4571).getEmail());
	}

	@Test
	@DisplayName("Record 4572: Web is http://www.bessieyragui.com")
	void WebOfRecord4572() {
		assertEquals("http://www.bessieyragui.com", customers.get(4571).getWeb());
	}
}
