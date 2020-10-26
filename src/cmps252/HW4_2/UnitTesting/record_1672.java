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
class Record_1672 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1672: FirstName is Malinda")
	void FirstNameOfRecord1672() {
		assertEquals("Malinda", customers.get(1671).getFirstName());
	}

	@Test
	@DisplayName("Record 1672: LastName is Stavrositu")
	void LastNameOfRecord1672() {
		assertEquals("Stavrositu", customers.get(1671).getLastName());
	}

	@Test
	@DisplayName("Record 1672: Company is Insurance & Financial Svc Ltd")
	void CompanyOfRecord1672() {
		assertEquals("Insurance & Financial Svc Ltd", customers.get(1671).getCompany());
	}

	@Test
	@DisplayName("Record 1672: Address is 205 W Jefferson Blvd  #-120")
	void AddressOfRecord1672() {
		assertEquals("205 W Jefferson Blvd  #-120", customers.get(1671).getAddress());
	}

	@Test
	@DisplayName("Record 1672: City is South Bend")
	void CityOfRecord1672() {
		assertEquals("South Bend", customers.get(1671).getCity());
	}

	@Test
	@DisplayName("Record 1672: County is St Joseph")
	void CountyOfRecord1672() {
		assertEquals("St Joseph", customers.get(1671).getCounty());
	}

	@Test
	@DisplayName("Record 1672: State is IN")
	void StateOfRecord1672() {
		assertEquals("IN", customers.get(1671).getState());
	}

	@Test
	@DisplayName("Record 1672: ZIP is 46601")
	void ZIPOfRecord1672() {
		assertEquals("46601", customers.get(1671).getZIP());
	}

	@Test
	@DisplayName("Record 1672: Phone is 574-233-0859")
	void PhoneOfRecord1672() {
		assertEquals("574-233-0859", customers.get(1671).getPhone());
	}

	@Test
	@DisplayName("Record 1672: Fax is 574-233-0086")
	void FaxOfRecord1672() {
		assertEquals("574-233-0086", customers.get(1671).getFax());
	}

	@Test
	@DisplayName("Record 1672: Email is malinda@stavrositu.com")
	void EmailOfRecord1672() {
		assertEquals("malinda@stavrositu.com", customers.get(1671).getEmail());
	}

	@Test
	@DisplayName("Record 1672: Web is http://www.malindastavrositu.com")
	void WebOfRecord1672() {
		assertEquals("http://www.malindastavrositu.com", customers.get(1671).getWeb());
	}
}
