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

@Tag("46")
class Record_3908 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3908: FirstName is Ashlygh")
	void FirstNameOfRecord3908() {
		assertEquals("Ashlygh", customers.get(3907).getFirstName());
	}

	@Test
	@DisplayName("Record 3908: LastName is Bure")
	void LastNameOfRecord3908() {
		assertEquals("Bure", customers.get(3907).getLastName());
	}

	@Test
	@DisplayName("Record 3908: Company is Powless, James K Esq")
	void CompanyOfRecord3908() {
		assertEquals("Powless, James K Esq", customers.get(3907).getCompany());
	}

	@Test
	@DisplayName("Record 3908: Address is 901 E Cary St")
	void AddressOfRecord3908() {
		assertEquals("901 E Cary St", customers.get(3907).getAddress());
	}

	@Test
	@DisplayName("Record 3908: City is Richmond")
	void CityOfRecord3908() {
		assertEquals("Richmond", customers.get(3907).getCity());
	}

	@Test
	@DisplayName("Record 3908: County is Richmond City")
	void CountyOfRecord3908() {
		assertEquals("Richmond City", customers.get(3907).getCounty());
	}

	@Test
	@DisplayName("Record 3908: State is VA")
	void StateOfRecord3908() {
		assertEquals("VA", customers.get(3907).getState());
	}

	@Test
	@DisplayName("Record 3908: ZIP is 23219")
	void ZIPOfRecord3908() {
		assertEquals("23219", customers.get(3907).getZIP());
	}

	@Test
	@DisplayName("Record 3908: Phone is 804-775-4202")
	void PhoneOfRecord3908() {
		assertEquals("804-775-4202", customers.get(3907).getPhone());
	}

	@Test
	@DisplayName("Record 3908: Fax is 804-775-2366")
	void FaxOfRecord3908() {
		assertEquals("804-775-2366", customers.get(3907).getFax());
	}

	@Test
	@DisplayName("Record 3908: Email is ashlygh@bure.com")
	void EmailOfRecord3908() {
		assertEquals("ashlygh@bure.com", customers.get(3907).getEmail());
	}

	@Test
	@DisplayName("Record 3908: Web is http://www.ashlyghbure.com")
	void WebOfRecord3908() {
		assertEquals("http://www.ashlyghbure.com", customers.get(3907).getWeb());
	}
}
