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

@Tag("34")
class Record_2011 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2011: FirstName is Lester")
	void FirstNameOfRecord2011() {
		assertEquals("Lester", customers.get(2010).getFirstName());
	}

	@Test
	@DisplayName("Record 2011: LastName is Cinco")
	void LastNameOfRecord2011() {
		assertEquals("Cinco", customers.get(2010).getLastName());
	}

	@Test
	@DisplayName("Record 2011: Company is Mcnyll, Regena K Esq")
	void CompanyOfRecord2011() {
		assertEquals("Mcnyll, Regena K Esq", customers.get(2010).getCompany());
	}

	@Test
	@DisplayName("Record 2011: Address is 1661 York Ave")
	void AddressOfRecord2011() {
		assertEquals("1661 York Ave", customers.get(2010).getAddress());
	}

	@Test
	@DisplayName("Record 2011: City is New York")
	void CityOfRecord2011() {
		assertEquals("New York", customers.get(2010).getCity());
	}

	@Test
	@DisplayName("Record 2011: County is New York")
	void CountyOfRecord2011() {
		assertEquals("New York", customers.get(2010).getCounty());
	}

	@Test
	@DisplayName("Record 2011: State is NY")
	void StateOfRecord2011() {
		assertEquals("NY", customers.get(2010).getState());
	}

	@Test
	@DisplayName("Record 2011: ZIP is 10128")
	void ZIPOfRecord2011() {
		assertEquals("10128", customers.get(2010).getZIP());
	}

	@Test
	@DisplayName("Record 2011: Phone is 212-410-7897")
	void PhoneOfRecord2011() {
		assertEquals("212-410-7897", customers.get(2010).getPhone());
	}

	@Test
	@DisplayName("Record 2011: Fax is 212-410-1297")
	void FaxOfRecord2011() {
		assertEquals("212-410-1297", customers.get(2010).getFax());
	}

	@Test
	@DisplayName("Record 2011: Email is lester@cinco.com")
	void EmailOfRecord2011() {
		assertEquals("lester@cinco.com", customers.get(2010).getEmail());
	}

	@Test
	@DisplayName("Record 2011: Web is http://www.lestercinco.com")
	void WebOfRecord2011() {
		assertEquals("http://www.lestercinco.com", customers.get(2010).getWeb());
	}
}
