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

@Tag("9")
class Record_4789 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4789: FirstName is Shanda")
	void FirstNameOfRecord4789() {
		assertEquals("Shanda", customers.get(4788).getFirstName());
	}

	@Test
	@DisplayName("Record 4789: LastName is Branstutter")
	void LastNameOfRecord4789() {
		assertEquals("Branstutter", customers.get(4788).getLastName());
	}

	@Test
	@DisplayName("Record 4789: Company is Mullen, John P Esq")
	void CompanyOfRecord4789() {
		assertEquals("Mullen, John P Esq", customers.get(4788).getCompany());
	}

	@Test
	@DisplayName("Record 4789: Address is 12 Roszel Rd  #-101")
	void AddressOfRecord4789() {
		assertEquals("12 Roszel Rd  #-101", customers.get(4788).getAddress());
	}

	@Test
	@DisplayName("Record 4789: City is Princeton")
	void CityOfRecord4789() {
		assertEquals("Princeton", customers.get(4788).getCity());
	}

	@Test
	@DisplayName("Record 4789: County is Mercer")
	void CountyOfRecord4789() {
		assertEquals("Mercer", customers.get(4788).getCounty());
	}

	@Test
	@DisplayName("Record 4789: State is NJ")
	void StateOfRecord4789() {
		assertEquals("NJ", customers.get(4788).getState());
	}

	@Test
	@DisplayName("Record 4789: ZIP is 8540")
	void ZIPOfRecord4789() {
		assertEquals("8540", customers.get(4788).getZIP());
	}

	@Test
	@DisplayName("Record 4789: Phone is 609-452-2360")
	void PhoneOfRecord4789() {
		assertEquals("609-452-2360", customers.get(4788).getPhone());
	}

	@Test
	@DisplayName("Record 4789: Fax is 609-452-0403")
	void FaxOfRecord4789() {
		assertEquals("609-452-0403", customers.get(4788).getFax());
	}

	@Test
	@DisplayName("Record 4789: Email is shanda@branstutter.com")
	void EmailOfRecord4789() {
		assertEquals("shanda@branstutter.com", customers.get(4788).getEmail());
	}

	@Test
	@DisplayName("Record 4789: Web is http://www.shandabranstutter.com")
	void WebOfRecord4789() {
		assertEquals("http://www.shandabranstutter.com", customers.get(4788).getWeb());
	}
}
