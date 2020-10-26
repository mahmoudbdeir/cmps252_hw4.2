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

@Tag("35")
class Record_4499 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4499: FirstName is Samantha")
	void FirstNameOfRecord4499() {
		assertEquals("Samantha", customers.get(4498).getFirstName());
	}

	@Test
	@DisplayName("Record 4499: LastName is Ehli")
	void LastNameOfRecord4499() {
		assertEquals("Ehli", customers.get(4498).getLastName());
	}

	@Test
	@DisplayName("Record 4499: Company is Milford Travel Service Inc")
	void CompanyOfRecord4499() {
		assertEquals("Milford Travel Service Inc", customers.get(4498).getCompany());
	}

	@Test
	@DisplayName("Record 4499: Address is 217 Nw 1st Ave")
	void AddressOfRecord4499() {
		assertEquals("217 Nw 1st Ave", customers.get(4498).getAddress());
	}

	@Test
	@DisplayName("Record 4499: City is Grand Rapids")
	void CityOfRecord4499() {
		assertEquals("Grand Rapids", customers.get(4498).getCity());
	}

	@Test
	@DisplayName("Record 4499: County is Itasca")
	void CountyOfRecord4499() {
		assertEquals("Itasca", customers.get(4498).getCounty());
	}

	@Test
	@DisplayName("Record 4499: State is MN")
	void StateOfRecord4499() {
		assertEquals("MN", customers.get(4498).getState());
	}

	@Test
	@DisplayName("Record 4499: ZIP is 55744")
	void ZIPOfRecord4499() {
		assertEquals("55744", customers.get(4498).getZIP());
	}

	@Test
	@DisplayName("Record 4499: Phone is 218-326-6237")
	void PhoneOfRecord4499() {
		assertEquals("218-326-6237", customers.get(4498).getPhone());
	}

	@Test
	@DisplayName("Record 4499: Fax is 218-326-1117")
	void FaxOfRecord4499() {
		assertEquals("218-326-1117", customers.get(4498).getFax());
	}

	@Test
	@DisplayName("Record 4499: Email is samantha@ehli.com")
	void EmailOfRecord4499() {
		assertEquals("samantha@ehli.com", customers.get(4498).getEmail());
	}

	@Test
	@DisplayName("Record 4499: Web is http://www.samanthaehli.com")
	void WebOfRecord4499() {
		assertEquals("http://www.samanthaehli.com", customers.get(4498).getWeb());
	}
}
