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

@Tag("41")
class Record_2217 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2217: FirstName is Lottie")
	void FirstNameOfRecord2217() {
		assertEquals("Lottie", customers.get(2216).getFirstName());
	}

	@Test
	@DisplayName("Record 2217: LastName is Foust")
	void LastNameOfRecord2217() {
		assertEquals("Foust", customers.get(2216).getLastName());
	}

	@Test
	@DisplayName("Record 2217: Company is Atlantic Computer Enterprises")
	void CompanyOfRecord2217() {
		assertEquals("Atlantic Computer Enterprises", customers.get(2216).getCompany());
	}

	@Test
	@DisplayName("Record 2217: Address is 310 Washington St")
	void AddressOfRecord2217() {
		assertEquals("310 Washington St", customers.get(2216).getAddress());
	}

	@Test
	@DisplayName("Record 2217: City is New Richmond")
	void CityOfRecord2217() {
		assertEquals("New Richmond", customers.get(2216).getCity());
	}

	@Test
	@DisplayName("Record 2217: County is Clermont")
	void CountyOfRecord2217() {
		assertEquals("Clermont", customers.get(2216).getCounty());
	}

	@Test
	@DisplayName("Record 2217: State is OH")
	void StateOfRecord2217() {
		assertEquals("OH", customers.get(2216).getState());
	}

	@Test
	@DisplayName("Record 2217: ZIP is 45157")
	void ZIPOfRecord2217() {
		assertEquals("45157", customers.get(2216).getZIP());
	}

	@Test
	@DisplayName("Record 2217: Phone is 513-553-9520")
	void PhoneOfRecord2217() {
		assertEquals("513-553-9520", customers.get(2216).getPhone());
	}

	@Test
	@DisplayName("Record 2217: Fax is 513-553-9021")
	void FaxOfRecord2217() {
		assertEquals("513-553-9021", customers.get(2216).getFax());
	}

	@Test
	@DisplayName("Record 2217: Email is lottie@foust.com")
	void EmailOfRecord2217() {
		assertEquals("lottie@foust.com", customers.get(2216).getEmail());
	}

	@Test
	@DisplayName("Record 2217: Web is http://www.lottiefoust.com")
	void WebOfRecord2217() {
		assertEquals("http://www.lottiefoust.com", customers.get(2216).getWeb());
	}
}
