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
class Record_1472 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1472: FirstName is Lily")
	void FirstNameOfRecord1472() {
		assertEquals("Lily", customers.get(1471).getFirstName());
	}

	@Test
	@DisplayName("Record 1472: LastName is Hunting")
	void LastNameOfRecord1472() {
		assertEquals("Hunting", customers.get(1471).getLastName());
	}

	@Test
	@DisplayName("Record 1472: Company is Silver, Alan J Esq")
	void CompanyOfRecord1472() {
		assertEquals("Silver, Alan J Esq", customers.get(1471).getCompany());
	}

	@Test
	@DisplayName("Record 1472: Address is 741 Vanderperren Way")
	void AddressOfRecord1472() {
		assertEquals("741 Vanderperren Way", customers.get(1471).getAddress());
	}

	@Test
	@DisplayName("Record 1472: City is Green Bay")
	void CityOfRecord1472() {
		assertEquals("Green Bay", customers.get(1471).getCity());
	}

	@Test
	@DisplayName("Record 1472: County is Brown")
	void CountyOfRecord1472() {
		assertEquals("Brown", customers.get(1471).getCounty());
	}

	@Test
	@DisplayName("Record 1472: State is WI")
	void StateOfRecord1472() {
		assertEquals("WI", customers.get(1471).getState());
	}

	@Test
	@DisplayName("Record 1472: ZIP is 54304")
	void ZIPOfRecord1472() {
		assertEquals("54304", customers.get(1471).getZIP());
	}

	@Test
	@DisplayName("Record 1472: Phone is 920-432-3136")
	void PhoneOfRecord1472() {
		assertEquals("920-432-3136", customers.get(1471).getPhone());
	}

	@Test
	@DisplayName("Record 1472: Fax is 920-432-3398")
	void FaxOfRecord1472() {
		assertEquals("920-432-3398", customers.get(1471).getFax());
	}

	@Test
	@DisplayName("Record 1472: Email is lily@hunting.com")
	void EmailOfRecord1472() {
		assertEquals("lily@hunting.com", customers.get(1471).getEmail());
	}

	@Test
	@DisplayName("Record 1472: Web is http://www.lilyhunting.com")
	void WebOfRecord1472() {
		assertEquals("http://www.lilyhunting.com", customers.get(1471).getWeb());
	}
}
