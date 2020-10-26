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
class Record_2312 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2312: FirstName is Myrna")
	void FirstNameOfRecord2312() {
		assertEquals("Myrna", customers.get(2311).getFirstName());
	}

	@Test
	@DisplayName("Record 2312: LastName is Hanagami")
	void LastNameOfRecord2312() {
		assertEquals("Hanagami", customers.get(2311).getLastName());
	}

	@Test
	@DisplayName("Record 2312: Company is Bishop, Maryellen K Esq")
	void CompanyOfRecord2312() {
		assertEquals("Bishop, Maryellen K Esq", customers.get(2311).getCompany());
	}

	@Test
	@DisplayName("Record 2312: Address is 173 Lakeview Ave")
	void AddressOfRecord2312() {
		assertEquals("173 Lakeview Ave", customers.get(2311).getAddress());
	}

	@Test
	@DisplayName("Record 2312: City is Clifton")
	void CityOfRecord2312() {
		assertEquals("Clifton", customers.get(2311).getCity());
	}

	@Test
	@DisplayName("Record 2312: County is Passaic")
	void CountyOfRecord2312() {
		assertEquals("Passaic", customers.get(2311).getCounty());
	}

	@Test
	@DisplayName("Record 2312: State is NJ")
	void StateOfRecord2312() {
		assertEquals("NJ", customers.get(2311).getState());
	}

	@Test
	@DisplayName("Record 2312: ZIP is 07011")
	void ZIPOfRecord2312() {
		assertEquals("07011", customers.get(2311).getZIP());
	}

	@Test
	@DisplayName("Record 2312: Phone is 973-772-5812")
	void PhoneOfRecord2312() {
		assertEquals("973-772-5812", customers.get(2311).getPhone());
	}

	@Test
	@DisplayName("Record 2312: Fax is 973-772-0174")
	void FaxOfRecord2312() {
		assertEquals("973-772-0174", customers.get(2311).getFax());
	}

	@Test
	@DisplayName("Record 2312: Email is myrna@hanagami.com")
	void EmailOfRecord2312() {
		assertEquals("myrna@hanagami.com", customers.get(2311).getEmail());
	}

	@Test
	@DisplayName("Record 2312: Web is http://www.myrnahanagami.com")
	void WebOfRecord2312() {
		assertEquals("http://www.myrnahanagami.com", customers.get(2311).getWeb());
	}
}
