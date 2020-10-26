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

@Tag("24")
class Record_2906 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2906: FirstName is Porfirio")
	void FirstNameOfRecord2906() {
		assertEquals("Porfirio", customers.get(2905).getFirstName());
	}

	@Test
	@DisplayName("Record 2906: LastName is Atthowe")
	void LastNameOfRecord2906() {
		assertEquals("Atthowe", customers.get(2905).getLastName());
	}

	@Test
	@DisplayName("Record 2906: Company is First Data Corp")
	void CompanyOfRecord2906() {
		assertEquals("First Data Corp", customers.get(2905).getCompany());
	}

	@Test
	@DisplayName("Record 2906: Address is 122 E Thayer Ave")
	void AddressOfRecord2906() {
		assertEquals("122 E Thayer Ave", customers.get(2905).getAddress());
	}

	@Test
	@DisplayName("Record 2906: City is Bismarck")
	void CityOfRecord2906() {
		assertEquals("Bismarck", customers.get(2905).getCity());
	}

	@Test
	@DisplayName("Record 2906: County is Burlygh")
	void CountyOfRecord2906() {
		assertEquals("Burlygh", customers.get(2905).getCounty());
	}

	@Test
	@DisplayName("Record 2906: State is ND")
	void StateOfRecord2906() {
		assertEquals("ND", customers.get(2905).getState());
	}

	@Test
	@DisplayName("Record 2906: ZIP is 58501")
	void ZIPOfRecord2906() {
		assertEquals("58501", customers.get(2905).getZIP());
	}

	@Test
	@DisplayName("Record 2906: Phone is 701-258-5932")
	void PhoneOfRecord2906() {
		assertEquals("701-258-5932", customers.get(2905).getPhone());
	}

	@Test
	@DisplayName("Record 2906: Fax is 701-258-3459")
	void FaxOfRecord2906() {
		assertEquals("701-258-3459", customers.get(2905).getFax());
	}

	@Test
	@DisplayName("Record 2906: Email is porfirio@atthowe.com")
	void EmailOfRecord2906() {
		assertEquals("porfirio@atthowe.com", customers.get(2905).getEmail());
	}

	@Test
	@DisplayName("Record 2906: Web is http://www.porfirioatthowe.com")
	void WebOfRecord2906() {
		assertEquals("http://www.porfirioatthowe.com", customers.get(2905).getWeb());
	}
}
