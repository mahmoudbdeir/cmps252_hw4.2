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

@Tag("18")
class Record_4266 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4266: FirstName is Harry")
	void FirstNameOfRecord4266() {
		assertEquals("Harry", customers.get(4265).getFirstName());
	}

	@Test
	@DisplayName("Record 4266: LastName is Truell")
	void LastNameOfRecord4266() {
		assertEquals("Truell", customers.get(4265).getLastName());
	}

	@Test
	@DisplayName("Record 4266: Company is Military Audits Mkt Info Inc")
	void CompanyOfRecord4266() {
		assertEquals("Military Audits Mkt Info Inc", customers.get(4265).getCompany());
	}

	@Test
	@DisplayName("Record 4266: Address is 600 Grant St")
	void AddressOfRecord4266() {
		assertEquals("600 Grant St", customers.get(4265).getAddress());
	}

	@Test
	@DisplayName("Record 4266: City is Pittsburgh")
	void CityOfRecord4266() {
		assertEquals("Pittsburgh", customers.get(4265).getCity());
	}

	@Test
	@DisplayName("Record 4266: County is Allegheny")
	void CountyOfRecord4266() {
		assertEquals("Allegheny", customers.get(4265).getCounty());
	}

	@Test
	@DisplayName("Record 4266: State is PA")
	void StateOfRecord4266() {
		assertEquals("PA", customers.get(4265).getState());
	}

	@Test
	@DisplayName("Record 4266: ZIP is 15219")
	void ZIPOfRecord4266() {
		assertEquals("15219", customers.get(4265).getZIP());
	}

	@Test
	@DisplayName("Record 4266: Phone is 412-566-5715")
	void PhoneOfRecord4266() {
		assertEquals("412-566-5715", customers.get(4265).getPhone());
	}

	@Test
	@DisplayName("Record 4266: Fax is 412-566-5586")
	void FaxOfRecord4266() {
		assertEquals("412-566-5586", customers.get(4265).getFax());
	}

	@Test
	@DisplayName("Record 4266: Email is harry@truell.com")
	void EmailOfRecord4266() {
		assertEquals("harry@truell.com", customers.get(4265).getEmail());
	}

	@Test
	@DisplayName("Record 4266: Web is http://www.harrytruell.com")
	void WebOfRecord4266() {
		assertEquals("http://www.harrytruell.com", customers.get(4265).getWeb());
	}
}
